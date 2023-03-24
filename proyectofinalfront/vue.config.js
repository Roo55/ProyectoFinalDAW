const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

module.exports = {
  publicPath: '/',
  css: {
    loaderOptions: {
      scss: {
        prependData: `@import "~bootstrap/scss/bootstrap";`,
      },
    },
  },
};
module.exports = {
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8081/api/auth/', 
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  }
}