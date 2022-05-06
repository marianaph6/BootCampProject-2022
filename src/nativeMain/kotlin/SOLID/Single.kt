package SOLID

class Single {

    // MAL: Esta clase viola el principio de responsabilidad única
    // La clase BadUser realiza acciones de almacenamiento así como acciones relacionadas con el usuario
    class BadUser {
        fun login() {}
        fun storeAuthToken() {
            // Logic for storing auth token
        }
        fun clearAuthToken() {
            // Logic for clearing auth token
        }
    }

    // MEJOR: Esta clase ya no realiza acciones de almacenamiento, reduciendo el número
    // de razones para que esta clase cambie
    interface AuthTokenStorage {
        fun store(token: String)
        fun clear()
    }

    class User(private val authStorage: AuthTokenStorage) {
        fun login() {}
        fun storeAuthToken(token: String) {
            authStorage.store(token)
        }
        fun clearAuthToken() {
            authStorage.clear()
        }
    }
}