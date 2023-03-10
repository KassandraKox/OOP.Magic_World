package Project_Magic_World.Magic_World_1;

import java.util.Random;

public class Generator {
    
    public String[] surname = new String[]{
    "Абрамов", "Алхимов", "Аксенов", "Александров", "Алексеев", "Андреев", "Анисимов", "Антонов", "Ананьев", "Афанасьев",
    "Баранов", "Белков", "Белоусов", "Беляев", "Бирюков", "Богданов", "Борисов", "Быков", "Васильев", "Виноградов",
    "Власов", "Волков", "Воробьев", "Воронин", "Воронов", "Гаврилов", "Галкин", "Герасимов", "Голубев", "Гончаров",
    "Горбунов", "Горшков", "Грачев", "Григорьев", "Гришин", "Громов", "Гусев", "Давыдов", "Данилов", "Демидов",
    "Демин", "Денисов", "Дмитриев", "Егоров", "Елисеев", "Емельянов", "Еремин", "Ермаков", "Ефимов", "Ефремов",
    "Жуков", "Журавлев", "Зайцев", "Захаров", "Иванов", "Ильин", "Исаев", "Казаков", "Калинин", "Карпов",
    "Кириллов", "Киселев", "Климов", "Князев", "Ковалев", "Козлов", "Колесников", "Комаров", "Кондратьев", "Коновалов",
    "Королев", "Котов", "Краснов", "Крылов", "Кудрявцев", "Кузнецов", "Кузьмин", "Куликов", "Лазарев", "Лебедев",
    "Левин", "Леонов", "Логинов", "Лукьянов", "Майоров", "Макаров", "Максимов", "Малышев", "Мальцев", "Марков",
    "Мартынов", "Маслов", "Матвеев", "Медведев", "Мельников", "Миронов", "Митрофанов", "Михайлов", "Михеев", "Моисеев",
    "Морозов", "Назаров", "Наумов", "Нестеров", "Никитин", "Никифоров", "Николаев", "Новиков", "Овчинников", "Орлов",
    "Осипов", "Павлов", "Планов", "Петров", "Плотников", "Поляков", "Пономарев", "Попов", "Потапов", "Прокофьев",
    "Прохоров", "Родионов", "Романов", "Румянцев", "Рыбаков", "Савельев", "Савин", "Самодуров" , "Сафонов", "Семенов", "Сергеев",
    "Сидоров", "Симонов", "Скворцов", "Смирнов", "Соболев", "Соколов", "Софин", "Сорокин", "Софронов",
    "Степанов", "Тарасов", "Тимофеев", "Титов", "Тихомиров", "Тихонов", "Трофимов", "Федоров", "Федотов", "Филатов",
    "Филиппов", "Фомин", "Фролов", "Харитонов", "Цветков", "Чернов", "Чернышев", "Щербаков", "Юдин", "Яковлев"};

    public String[] name = new String[]{
    "Александр",  "Алексей", "Анатолий", "Андрей",
    "Антон", "Артем", "Артём", "Артур", "Борис", "Вадим", "Валентин",
    "Валерий", "Василий", "Виктор",  "Виталий", "Владимир", "Владислав",
    "Вячеслав",  "Геннадий", "Георгий", "Григорий", "Данил",  "Денис",  
    "Дмитрий", "Евгений",  "Егор",  "Иван", "Игорь", "Илья", "Кирилл", 
    "Константин", "Леонид", "Максим","Михаил", "Никита", "Николай", "Нино", 
    "Олег", "Павел", "Петр", "Пётр", "Роман", "Руслан", "Сергей",
    "Станислав", "Степан", "Федор", "Эдуард", "Юрий"};

    public String[] unitType = new String[]{"arbalester", "robber", "farmer", "magician", "monk", "spearman", "sniper"};
    
    public String getName(){
        Random random = new Random();
        return surname[random.nextInt(surname.length)] + " " + name[random.nextInt(name.length)];
    }
    
    public String getUnitType(){
        Random random = new Random();
        return unitType[random.nextInt(unitType.length)];
    }

    public int getHeroType() {
        return 0;
    }
}
