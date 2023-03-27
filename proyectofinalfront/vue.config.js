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
  devServer: {
    proxy: {
      '^/api': {
        target: 'http://localhost:8081',
        changeOrigin: true,
        pathRewrite: {'^/api': '/api'}
      },
    }
  }
})
