package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        if (!list.contains(account)) {
            list.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            User user = findByPassport(passport);
            List<Account> list = users.get(user);
            for (Account acc : list) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc == null || destAcc == null || srcAcc.getBalance() < amount) {
            return false;
        }
        destAcc.setBalance(destAcc.getBalance() + amount);
        srcAcc.setBalance(srcAcc.getBalance() - amount);
        return true;
    }
}
