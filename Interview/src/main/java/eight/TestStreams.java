package eight;

import practice.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreams {

    public static void main(String[] args) {

        Transaction transaction = new Transaction();
        transaction.setId(1);
        transaction.setAmount(700);
        transaction.setType("cash");

        Transaction transaction2 = new Transaction();
        transaction2.setId(2);
        transaction2.setAmount(500);
        transaction2.setType("cash");


        Transaction transaction3 = new Transaction();
        transaction3.setId(3);
        transaction3.setAmount(300);
        transaction3.setType("card");

        Transaction transaction4 = new Transaction();
        transaction4.setId(4);
        transaction4.setAmount(200);
        transaction4.setType("cash");


        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(0, transaction);
        transactionList.add(1, transaction2);
        transactionList.add(2, transaction3);
        transactionList.add(3, transaction4);

        List<Transaction> transactions = new ArrayList<>();

        List<String> tra =transactionList.stream().map(p -> p.getType()).collect(Collectors.toList());



        for (Transaction t: transactionList) {
            if (t.getType().equals("cash")) {
                transactions.add(t);
            }
        }

        Comparator<Transaction> comparator = new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getAmount() - o2.getAmount();
            }
        };

        transactions.sort(comparator);

        for (Transaction t: transactions) {
            System.out.println(t.getId() + " " + t.getAmount() + " "+ t.getType());
        }

        List<Integer> transactionAmount = new ArrayList<>();
        for(Transaction t: transactions){
            transactionAmount.add(t.getAmount());
        }

        System.out.println(transactionAmount);


        List<Transaction> toSort = new ArrayList<>();

        for (Transaction p : transactionList) {
            if (p.getType().equals("cash")) {
                toSort.add(p);
            }
        }

        toSort.sort(Comparator.comparing(Transaction::getAmount));

        List<Integer> amount = new ArrayList<>();
        for (Transaction p : toSort) {
            Integer transaction1Amount = p.getAmount();
            amount.add(transaction1Amount);
        }

        System.out.println("For loop list" + amount );


        List<Integer> amoun2 = transactionList.parallelStream()
                .filter(p -> p.getType().equals("cash"))
                .sorted(Comparator.comparing(Transaction::getAmount))
                .map(Transaction::getAmount)
                .collect(Collectors.toList());





        System.out.println(amoun2);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(p -> p % 2 == 0).limit(4)
                .collect(Collectors.toList());


        System.out.println(evenNumbers);


        boolean avail = numbers.stream().allMatch( n -> n > 10);

        System.out.println("available: " + avail);

    }

}
