public class TestDZ {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        System.out.println(dog);
        System.out.println("Задача №2");
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper + " Задача №1");
        dog = dog + 4;
        System.out.println(dog + " Задача №2");
        cat = cat + 4;
        System.out.println(cat + " Задача №2");
        paper = paper + 4;
        System.out.println(paper + " Задача №2");
        dog = dog - 3.5;
        System.out.println(dog + " Задача №3");
        cat = cat - 1.6;
        System.out.println(cat + " Задача №3");
        paper = paper - 7639;
        System.out.println(paper + " Задача №3");
        var friend = 19;
        System.out.println(friend + " Задача №4");
        friend = friend + 2;
        System.out.println(friend + " Задача №4");
        friend = friend / 7;
        System.out.println(friend + " Задача №4");
        var frog = 3.5;
        System.out.println(frog + " Задача №5");
        frog = frog * 10;
        System.out.println(frog + " Задача №5");
        frog = frog / 3.5;
        System.out.println(frog + " Задача №5");
        frog = frog + 4;
        System.out.println(frog + " Задача №5");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight + " Общая масса Задача №6");
        var massDifference = secondBoxer - firstBoxer;
        System.out.println(massDifference + " Разница в весе Задание №6");
        var remainingWeight = (secondBoxer - firstBoxer) % totalWeight;
        System.out.println(remainingWeight + " Остаток Задание №6");
        var workingHours = 640;
        var employeeTime = 8;
        var employeeNumber = workingHours / employeeTime;
        System.out.println("В компании работает " + employeeNumber + " человек");
        var newEmployee = 94;
        var currentStaff = employeeNumber + newEmployee;
        var currentWorkingHours = currentStaff * employeeTime;
        System.out.println("Если в компании работает " + currentStaff + " человек, то всего " + currentWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}
