<template>
    <div class="calendar">
        <div class="calendar-header">
            <h1 class="calendar-title">Calendario de Eventos</h1>
            <h2 class="calendar-subtitle">{{ currentMonthName }} {{ currentYear }}</h2>
        </div>
        <div class="navigation">
            <button class="navigation-button" @click="previousMonth">&lt;</button>
            <h2 class="navigation-title">{{ currentMonthName }} {{ currentYear }}</h2>
            <button class="navigation-button" @click="nextMonth">&gt;</button>
        </div>
        <table class="calendar-table">
            <thead>
                <tr>
                    <th v-for="day in daysOfWeek" :key="day" class="calendar-header">{{ day }}</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="week in weeks" :key="week" class="calendar-week">
                    <td v-for="day in week" :key="day.date"
                        :class="{ 'today': isToday(day), 'event': day.className !== '' }" class="calendar-day">
                        <div class="calendar-date">{{ day.date }}</div>
                        <div v-if="day.className" class="event-info">
                            <p class="event-class">{{ day.className }}</p>
                            <p class="event-time">{{ day.time }}</p>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</template>
  
<script>
export default {
    data() {
        return {
            currentMonth: new Date().getMonth(),
            currentYear: new Date().getFullYear(),
            daysOfWeek: ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'],
            events: [
                { day: Math.floor(Math.random() * 31) + 1, className: 'Zumba', time: '10:00 am' },
                { day: Math.floor(Math.random() * 31) + 1, className: 'HIIT', time: '4:30 pm' },
                { day: Math.floor(Math.random() * 31) + 1, className: 'Spinning', time: '4:30 pm' },
                { day: Math.floor(Math.random() * 31) + 1, className: 'Pilates', time: '4:30 pm' },
                { day: Math.floor(Math.random() * 31) + 1, className: 'Yoga', time: '4:30 pm' },
                { day: Math.floor(Math.random() * 31) + 1, className: 'Kickboxing', time: '4:30 pm' },
            ],
        };
    },

    computed: {
        currentMonthName() {
            const monthNames = [
                'Enero',
                'Febrero',
                'Marzo',
                'Abril',
                'Mayo',
                'Junio',
                'Julio',
                'Agosto',
                'Septiembre',
                'Octubre',
                'Noviembre',
                'Diciembre',
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
                let event = null; // Inicializa el evento como nulo
                // Genera un número aleatorio entre 1 y 31 (o el número máximo de días del mes)
                const randomDay = Math.floor(Math.random() * lastDay) + 1;
                if (i === randomDay || i % 7 === 0) {
                    // Si el día actual coincide con el número aleatorio o es un múltiplo de 7, asigna un evento
                    const classNames = ['Zumba', 'HIIT', 'Spinning', 'Pilates', 'Yoga', 'Kickboxing']; // Arreglo de clases para asignar aleatoriamente
                    const randomIndex = Math.floor(Math.random() * classNames.length); // Genera un índice aleatorio
                    const className = classNames[randomIndex]; // Obtiene la clase aleatoria
                    const time = `${Math.floor(Math.random() * 12) + 1}:${Math.floor(Math.random() * 60).toString().padStart(2, '0')} ${Math.random() > 0.5 ? 'am' : 'pm'}`; // Genera una hora aleatoria
                    event = { day: i, className, time }; // Asigna el evento al día actual
                }
                const eventClassName = event ? event.className : ''; // Obtiene la clase del evento
                const eventTime = event ? event.time : ''; // Obtiene la hora del evento
                week.push({ date: i, dayOfWeek: date.getDay(), className: eventClassName, time: eventTime });
                if (date.getDay() === 6 || i === lastDay) {
                    weeks.push(week);
                    week = [];
                }
            }
            return weeks;
        }




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
            } else {
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
    },
};
</script>
  
<style scoped>
.calendar {
    max-width: 500px;
    margin: 0 auto;
    font-family: Arial, sans-serif;
}

.navigation {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 10px;
}

.navigation-button {
    background-color: #007bff;
    color: #fff;
    border: none;
    font-size: 18px;
    padding: 5px 10px;
    cursor: pointer;
}

.navigation-title {
    font-size: 20px;
    font-weight: bold;
    text-transform: uppercase;
    margin: 0;
}

.calendar-table {
    width: 100%;
    border-collapse: collapse;
}

.calendar-header,
.calendar-day {
    padding: 5px;
    text-align: center;
}

.calendar-header {
    font-weight: bold;
    text-transform: uppercase;
    border-bottom: 1px solid #ccc;
}

.calendar-day {
    border: 1px solid #ccc;
    height: 50px;
    overflow: hidden;
    position: relative;
}

.calendar-date {
    position: absolute;
    top: 5px;
    left: 5px;
}

.event-info {
    background-color: #007bff;
    color: #fff;
    padding: 5px;
}

.event-class,
.event-time {
    margin: 0;
    font-size: 12px;
}

.today {
    background-color: red;
    color: #fff;
}

.event {
    background-color: #28a745;
    color: #fff;
}
</style>