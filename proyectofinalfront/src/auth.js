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
export function isTokenExpired(token) {
  try{
    const decoded = jwt_decode.decode(token)
    if(decoded.exp < Date.now()/1000){
      return true;
    }else{
      return false;
    }
  }catch(e){
    return false;
  }
}
export function decodeToken() {
  const token = getToken()
  if (token) {
    return jwt_decode(token)
  } else {
    return null
  }
}
export function isAuthenticated() {
  const token = getToken()
  return !!token && !isTokenExpired(token)
}

