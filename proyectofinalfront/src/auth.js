import jwt_decode from 'jwt-decode'

const TOKEN_KEY = 'rlopez-token'

export function getToken() {
  return localStorage.getItem(TOKEN_KEY)
}

export function setToken(token) {
  localStorage.setItem(TOKEN_KEY, token)
}

export function removeToken() {
  localStorage.removeItem(TOKEN_KEY)
}

export function decodeToken() {
  const token = getToken()
  if (token) {
    return jwt_decode(token)
  } else {
    return null
  }
}
