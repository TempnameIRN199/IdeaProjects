package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _choice = in.nextInt();
        switch (_choice) {
            case 1:
                First();
                break;
            case 2:
                Second(in);
                break;
            case 3:
                Third(in);
                break;
            case 4:
                Fourth(in);
                break;
            case 5:
                Fifth(in);
                break;
            case 6:
                Sixth(in);
                break;
            case 7:
                Seventh(in);
                break;
            case 8:
                Eighth(in);
                break;
            case 9:
                Ninth();
                break;
            case 10:
                Tenth();
                break;
            case 11:
                int _length = in.nextInt();
                String _direction = in.next();
                char _symbol = in.next().charAt(0);
                Eleventh(_length, _direction, _symbol);
                break;
            case 12:
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                String _dir = in.next();
                Twelfth(arr, _dir);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public static void First() {
        System.out.println("\"Your time is limited,");
        System.out.println("\tso don't waste it ");
        System.out.println("\t\tliving someone else's life.\"");
        System.out.println("\t\t\t- Steve Jobs");
    }

    public static void Second(Scanner ln) {
        int _num1 = ln.nextInt();
        int _num2 = ln.nextInt();
        System.out.println(_num2 + "% of " + _num1 + " is " + (_num1 * _num2 / 100));
    }

    public static void Third(Scanner ln) {
        int _num1 = ln.nextInt();
        int _num2 = ln.nextInt();
        int _num3 = ln.nextInt();
        System.out.println(_num1 * 100 + _num2 * 10 + _num3);
    }

    public static void Fourth(Scanner ln) {
        int _num = ln.nextInt();
        if (_num < 100000 || _num > 999999) {
            System.out.println("Invalid Input");
        } else {
            int _num1 = _num / 100000;
            int _num2 = _num / 10000 % 10;
            int _num3 = _num / 1000 % 10;
            int _num4 = _num / 100 % 10;
            int _num5 = _num / 10 % 10;
            int _num6 = _num % 10;
            System.out.println(_num6 * 100000 + _num2 * 10000 + _num3 * 1000 + _num4 * 100 + _num5 * 10 + _num1);
        }
    }

    public static void Fifth(Scanner ln) {
        int _month = ln.nextInt();
        if (_month < 1 || _month > 12) {
            System.out.println("Invalid Input");
        } else if (_month == 1 || _month == 2 || _month == 12) {
            System.out.println("Winter");
        } else if (_month >= 3 && _month <= 5) {
            System.out.println("Spring");
        } else if (_month >= 6 && _month <= 8) {
            System.out.println("Summer");
        } else if (_month >= 9 && _month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void Sixth(Scanner ln) {
        int _num = ln.nextInt();
        int _choice = ln.nextInt();
        switch (_choice) {
            case 1:
                System.out.println(_num * 0.000621371);
                break;
            case 2:
                System.out.println(_num * 39.3701);
                break;
            case 3:
                System.out.println(_num * 1.09361);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public static void Seventh(Scanner ln) {
        int _num1 = ln.nextInt();
        int _num2 = ln.nextInt();
        if (_num1 > _num2) {
            int _temp = _num1;
            _num1 = _num2;
            _num2 = _temp;
        }
        for (int i = _num1; i <= _num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void Eighth(Scanner ln) {
        int _num1 = ln.nextInt();
        int _num2 = ln.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = _num1; j <= _num2; j++) {
                System.out.print(j + "*" + i + " = " + j * i + "\t");
            }
            System.out.println();
        }
    }

    public static void Ninth() {
        int[] arr = new int[10];
        int min = arr[0];
        int max = arr[0];
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21) - 10;
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] > 0) {
                positive++;
            } else {
                zero++;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Negative: " + negative);
        System.out.println("Positive: " + positive);
        System.out.println("Zero: " + zero);
    }

    public static void Tenth() {
        int[] arr = new int[10];
        int[] even = new int[10];
        int[] odd = new int[10];
        int[] negative = new int[10];
        int[] positive = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21) - 10;
            if (arr[i] % 2 == 0) {
                even[i] = arr[i];
            }
            if (arr[i] % 2 != 0) {
                odd[i] = arr[i];
            }
            if (arr[i] < 0) {
                negative[i] = arr[i];
            }
            if (arr[i] > 0) {
                positive[i] = arr[i];
            }
        }
        System.out.println("Even: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.println("Odd: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.println("Negative: ");
        for (int i = 0; i < negative.length; i++) {
            System.out.print(negative[i] + " ");
        }
        System.out.println();
        System.out.println("Positive: ");
        for (int i = 0; i < positive.length; i++) {
            System.out.print(positive[i] + " ");
        }
    }

    public static void Eleventh(int length, String direction, char symbol) {
        if (direction.equals("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else if (direction.equals("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else {
            System.out.println("Invalid Direction");
        }
    }

    public static void Twelfth(int[] arr, String direction) {
        if (direction.equals("ascending")) {
            Arrays.sort(arr);
        } else if (direction.equals("descending")) {
            Arrays.sort(arr);
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[arr.length - i - 1];
            }
            arr = temp;
        } else {
            System.out.println("Invalid Direction");
        }
    }
}