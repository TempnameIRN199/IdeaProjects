package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int _choice;
        Scanner ln = new Scanner(System.in);
        System.out.println("Choose a task:");
        _choice = ln.nextInt();
        switch (_choice) {
            case 1:
                First();
                break;
            case 2:
                Second(ln);
                break;
            case 3:
                Third(ln);
                break;
            case 4:
                Fourth(ln);
                break;
            case 5:
                Fifth(ln);
                break;
            case 6:
                Sixth(ln);
                break;
            case 7:
                Seventh(ln);
                break;
            case 8:
                Eighth(ln);
                break;
            case 9:
                Ninth(ln);
                break;
            case 10:
                Tenth(ln);
                break;
            case 11:
                int _first = ln.nextInt();
                int _second = ln.nextInt();
                System.out.println(Eleventh(_first, _second));
                break;
            case 12:
                Twelfth(ln);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void First() {
        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight");
        System.out.println();
    }

    public static void Second(Scanner ln) {
        int _num1 = ln.nextInt();
        int _num2 = ln.nextInt();
        System.out.println("Sum: " + (_num1 + _num2));
        System.out.println("Difference: " + (_num1 - _num2));
        System.out.println("Product: " + (_num1 * _num2));
    }

    public static void Third(Scanner ln) {
        int _num = ln.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.print(_num % 10);
            _num /= 10;
        }
    }

    public static void Fourth(Scanner ln) {
        int _num = ln.nextInt();
        if (_num >= 0 && _num < 6) {
            System.out.println("Good Night");
        } else if (_num >= 6 && _num < 13) {
            System.out.println("Good Morning");
        } else if (_num >= 13 && _num < 17) {
            System.out.println("Good Day");
        } else if (_num >= 17 && _num < 24) {
            System.out.println("Good Evening");
        }
    }

    public static void Fifth(Scanner ln) {
        int _num = ln.nextInt();
        int _sum1 = 0;
        int _sum2 = 0;
        for (int i = 0; i < 3; i++) {
            _sum1 += _num % 10;
            _num /= 10;
        }
        for (int i = 0; i < 3; i++) {
            _sum2 += _num % 10;
            _num /= 10;
        }
        if (_sum1 == _sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }
    }

    public static void Sixth(Scanner ln) {
        int _num = ln.nextInt();
        if (_num >= 1 && _num <= 100) {
            if (_num % 3 == 0 && _num % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (_num % 3 == 0) {
                System.out.println("Fizz");
            } else if (_num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(_num);
            }
        }
    }

    public static void Seventh(Scanner ln) {
        int _num = ln.nextInt();
        int _fact = 1;
        for (int i = 1; i <= _num; i++) {
            _fact *= i;
        }
        System.out.println(_fact);
    }

    public static void Eighth(Scanner ln) {
        int _num = ln.nextInt();
        boolean _isPrime = true;
        for (int i = 2; i <= _num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    _isPrime = false;
                    break;
                }
            }
            if (_isPrime) {
                System.out.println(i);
            }
            _isPrime = true;
        }
    }

    public static void Ninth(Scanner ln) {
        int _n = ln.nextInt();
        int[] _num = new int[_n];
        int _sum = 0;
        int _sr = 0;
        for (int i = 0; i < _n; i++) {
            _num[i] = (int) (Math.random() * 100);
            System.out.println(_num[i]);
        }
        for (int i = 0; i < _n; i++) {
            for (int j = 0; j <= i; j++) {
                _sum += _num[j];
            }
        }
        _sr = _sum / _n;
        System.out.println("Sum: " + _sum);
        System.out.println("Sr: " + _sr);
    }

    public static void Tenth(Scanner ln) {
        int _n = ln.nextInt();
        int[] _num = new int[_n];
        int _num1 = ln.nextInt();
        int _count = 0;
        for (int i = 0; i < _n; i++) {
            _num[i] = (int) (Math.random() * 100);
            System.out.println(_num[i]);
            if (_num[i] == _num1) {
                _count++;
            }
        }
        System.out.println("Count: " + _count);
    }

    public static int Eleventh(int _first, int _second) {
        int _sum = 0;
        for (int i = _first; i <= _second; i++) {
            _sum += i;
        }
        return _sum;
    }

    public static void Twelfth(Scanner ln) {
        int _n = ln.nextInt();
        int[] _num = new int[_n];
        int[] _fact = new int[_n];
        for (int i = 0; i < _n; i++) {
            _num[i] = (int) (Math.random() * 100);
            System.out.println(_num[i]);
        }
        for (int i = 0; i < _n; i++) {
            _fact[i] = 1;
            for (int j = 1; j <= _num[i]; j++) {
                _fact[i] *= j;
            }
            System.out.println(_fact[i]);
        }
    }
}