package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует модель для банковской системы.
 * @author Aleksander Ivanov
 * @version 1.0
 */
public class BankService {
    /**
     * поле содержит всех пользователей системы с привязанными к ним счетами
     * в коллекци HashMap.
     */

    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляе его в список.
     * @param user польователь который добавляется в список.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает паспорт пользователя и удаляет пользователя
     * по паспорту из системы.
     * @param passport паспорт пользователя.
     * @return удаляет пользователья или возвращает null если
     * пользователь с таким папортом не найден.
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый счет пользователю, если такого счета у него еще нет.
     * @param passport паспорт пользователя.
     * @param account добавляемый счет пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> listAccount = users.get(user);
            if (!listAccount.contains(account)) {
                listAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта:
     * @param passport паспорт пользователя.
     * @return возвращает пользователя по номеру паспорта или null
     * если такого номера нету.
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User temp : users.keySet()) {
            if (temp.getPassport().equals(passport)) {
                user = temp;
                break;
            }
        }
        return user;
    }

    /**
     * Метод ищет счет пользователя по паспарту и реквизитам:
     * @param passport паспорт пользователя.
     * @param requisite реквизиты счета.
     * @return возвращает счет пользователя по реквизитам и паспорту или null
     * если такого паспорта нету.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account temp : list) {
                if (temp.getRequisite().equals(requisite)) {
                    account = temp;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Метод перечисляет деньги с одного счёта на другой счёт.
     * @param srcPassport данные паспорта отправителя.
     * @param srcRequisite реквизиты счета списания.
     * @param destPassport данные паспорта получателя.
     * @param destRequisite реквизиты счета закичления.
     * @param amount сумма перевода.
     * @return возвращает true если перевод прошел успешно или
     * false если счёт не найден или не хватает денег на счёте отправителя.
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
