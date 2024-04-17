package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность ошибки: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Отчёт об ошибке: " + message);
    }

    public static void main(String[] args) {
        Error compile = new Error();
        compile.printInfo();
        Error loadPage = new Error(false, 404, "Страница не найдена");
        loadPage.printInfo();
        Error server = new Error(true, 500, "Внутрення ошибка сервера");
        server.printInfo();
    }
}