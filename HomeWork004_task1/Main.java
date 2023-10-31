package HomeWork004_task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Логин");
        String login = scanner.nextLine();
        System.out.println("Введите Пароль");
        String password = scanner.nextLine();
        System.out.println("Повторите Пароль");
        String confirmPassword = scanner.nextLine();

        try {
            if (checkLoginPassword(login,password,confirmPassword)) {
                System.out.println("Авторизация пользователя прошла успешно");
            }
        } catch (WrongLoginException e) {
            System.out.println("Логин должен быть меньше 20 символов");
        }catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkLoginPassword(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (login.length() > 20) throw new WrongLoginException();
        if (password.length() > 20) throw new WrongPasswordException("Пароль должен быть меньше 20 символов");
        if (!password.equals(confirmPassword)) throw new WrongPasswordException("Пароль и подтверждение пароля должны быть одинаковые");
        return true;
    }


}


