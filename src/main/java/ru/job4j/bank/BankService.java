package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает сервис перевода денег с одного банковского счета на другой.
 * Позволяет регистрировать пользователя, удалять пользователя из системы,
 * добавлять пользователю банковский счет, у пользователя системы могут быть несколько счетов.
 *
 * @author ALEKSANDR KOCHKURKIN
 * @version 1.0
 */
public class BankService {
    /**
     * Всех пользователей со списком их аккаунтов храним в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в систему.
     *
     * @param user пользователь банка.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет пользователю. Пользователя ищем по паспорту.
     *
     * @param passport паспорт пользователя
     * @param account  новый счет пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по его паспорту.
     *
     * @param passport паспорт пользователя.
     * @return пользователя, которого нашли по паспорту.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет найти счет пользователя по реквизитам.
     *
     * @param passport  паспорт пользователя
     * @param requisite реквизиты счета
     * @return счет пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод для перечисления денег с одного счета на другой
     *
     * @param srcPassport   паспорт пользователя от кого переводим
     * @param srcRequisite  реквизиты счета откуда переводим
     * @param destPassport  паспорт пользователя кому переводим
     * @param destRequisite реквизиты счета куда переводим
     * @param amount        сумма перевода
     * @return получилось ли перевести деньги
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> srcAcc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc.isPresent() && destAcc.isPresent() && srcAcc.get().getBalance() >= amount) {
            destAcc.get().setBalance(destAcc.get().getBalance() + amount);
            srcAcc.get().setBalance(srcAcc.get().getBalance() - amount);
            return true;
        }
        return false;
    }
}
