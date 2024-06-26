const { defineConfig } = require('@vue/cli-service')

module.exports = defineConfig({
  transpileDependencies: true,
  publicPath: '/',
  css: {
    loaderOptions: {
      scss: {
        prependData: `@import "~bootstrap/scss/bootstrap";`,
      },
    },
  },
})
