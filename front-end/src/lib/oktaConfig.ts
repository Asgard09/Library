export const oktaconfig = {
    clientId: '0oak0ydnef6koucEQ5d7',
    issuer: 'https://dev-74096160.okta.com/oauth2/default',
    redirectUri: 'https://localhost:3000/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true,
}