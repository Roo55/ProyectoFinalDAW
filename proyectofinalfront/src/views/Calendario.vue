<template>
    <div class="calendar">
        <h2>{{ currentMonthName }} {{ currentYear }}</h2>
        <table>
            <thead>
                <tr>
                    <th v-for="day in daysOfWeek" :key="day">{{ day }}</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="week in weeks" :key="week">
                    <td v-for="day in week" :key="day.date" :class="{ 'today': isToday(day) }">
                        <div class="day-container" v-color-aleatorio>
                            <div class="day">{{ day.date }}</div>
                            <div class="class" v-if="day.classIndex >= 0" v-class-color="day.classIndex">{{
                                classes[day.classIndex] }}</div>
                            <div class="time" v-if="day.classIndex >= 0" v-class-color="day.classIndex">{{ day.time }}</div>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
        <div class="navigation">
            <button @click="previousMonth">&lt;</button>
            <button @click="nextMonth">&gt;</button>
        </div>
    </div>
</template>
  
<script>
export default {
    data() {
        return {
            currentMonth: new Date().getMonth(),
            currentYear: new Date().getFullYear(),
            colorClasses: {},
            daysOfWeek: ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'],
            classes: [
                'Yoga',
                'Pilates',
                'Zumba',
                'Spinning',
                'HIIT',
                'CrossFit',
                'Boxeo',
                'Natación',
            ],
            times: [
                '8:00 AM',
                '9:00 AM',
                '10:00 AM',
                '11:00 AM',
                '12:00 PM',
                '4:00 PM',
                '5:00 PM',
                '6:00 PM',
                '7:00 PM',
            ],
        };
    },
    directives: {
    'color-aleatorio': {
        bind: function(el, binding) {
            // Generar un color aleatorio en formato hexadecimal
            const color = '#' + Math.floor(Math.random() * 16777215).toString(16);
            // Asignar el color al fondo del elemento
            el.style.backgroundColor = color;
        }
    }
},

    computed: {
        currentMonthName() {
            const monthNames = [
                'January',
                'February',
                'March',
                'April',
                'May',
                'June',
                'July',
                'August',
                'September',
                'October',
                'November',
                'December',
            ];
            return monthNames[this.currentMonth];
        },
        weeks() {
            const weeks = [];
            const firstDay = new Date(this.currentYear, this.currentMonth, 1).getDay();
            const lastDay = new Date(this.currentYear, this.currentMonth + 1, 0).getDate();
            let week = [];
            for (let i = 0; i < firstDay; i++) {
                week.push({ date: '' });
            }
            for (let i = 1; i <= lastDay; i++) {
                const date = new Date(this.currentYear, this.currentMonth, i);
                const hasClass = Math.random() < 0.5; // Cambia 0.5 a la probabilidad deseada
                const classIndex = hasClass ? Math.floor(Math.random() * this.classes.length) : -1;
                const time = hasClass ? this.times[Math.floor(Math.random() * this.times.length)] : '';

                if (hasClass && !this.colorClasses[classIndex]) {
                    // Asignar un color aleatorio a la clase si aún no tiene uno
                    this.colorClasses[classIndex] = '#' + Math.floor(Math.random() * 16777215).toString(16);
                }

                week.push({ date: i, dayOfWeek: date.getDay(), classIndex, time });
                if (date.getDay() === 6 || i === lastDay) {
                    weeks.push(week);
                    week = [];
                }
            }
            return weeks;
        },

    },
    methods: {
        isToday(day) {
            const today = new Date();
            return (
                day.date === today.getDate() &&
                this.currentMonth === today.getMonth() &&
                this.currentYear === today.getFullYear()
            );
        },
        previousMonth() {
            if (this.currentMonth === 0) {
                this.currentMonth = 11;
                this.currentYear--;
            }
            else {
                this.currentMonth--;
            }
        },
        nextMonth() {
            if (this.currentMonth === 11) {
                this.currentMonth = 0;
                this.currentYear++;
            } else {
                this.currentMonth++;
            }
        },
        getRandomClass() {
            return this.classes[Math.floor(Math.random() * this.classes.length)];
        },
        getRandomTime() {
            return this.times[Math.floor(Math.random() * this.times.length)];
        },
    },
};
</script>

<style scoped>
.calendar {
    max-width: 600px;
    margin: 0 auto;
}

h2 {
    text-align: center;
}

table {
    width: 100%;
    border-collapse: collapse;
}

th,
td {
    text-align: center;
    padding: 8px;
}

.today {
    background-color: #eee;
}

.day-container {
    position: relative;
}

.day {
    font-size: 18px;
}

.class {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 14px;
    color: #fff;
    padding: 4px 8px;

    /* Agregar esta línea para aplicar el color asignado a la clase */
    background-color: transparent;
    background-color: var(--class-color);
}

.time {
    position: absolute;
    bottom: 4px;
    left: 50%;
    transform: translateX(-50%);
    font-size: 12px;
}


.navigation {
    display: flex;
    justify-content: center;
    margin-top: 1rem;
}
</style>
