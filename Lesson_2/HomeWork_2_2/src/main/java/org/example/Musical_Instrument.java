package org.example;

// Створіть базовий клас “Музичний інструмент” і похідні класи “Скрипка”, “Тромбон”, “Укулеле”,
//“Віолончель”. З допомогою конструктора встановити ім’я кожного музичного інструменту і його
//характеристики.
//Реалізуйте для кожного з класів методи:
// Sound – видає звук музичного інструменту (пишемо текстом в консоль)
// Show – відображає назву музичного інструмента
// Desc – відображає опис музичного інструмента
// History – відображає історію створення музичного інструмента

public class Musical_Instrument {
    private String name;

    public Musical_Instrument(String name) {
        this.name = name;
    }

    public void Sound() {
        System.out.println("Sound of " + name);
    }

    public void Show() {
        System.out.println("Name of musical instrument: " + name);
    }

    public void Desc() {
        System.out.println("Description of musical instrument: " + name);
    }

    public void History() {
        System.out.println("History of musical instrument: " + name);
    }
}

class Violin extends Musical_Instrument {
    public Violin(String name) {
        super(name);
    }
}

class Trombone extends Musical_Instrument {
    public Trombone(String name) {
        super(name);
    }
}

class Ukulele extends Musical_Instrument {
    public Ukulele(String name) {
        super(name);
    }
}

class Cello extends Musical_Instrument {
    public Cello(String name) {
        super(name);
    }
}