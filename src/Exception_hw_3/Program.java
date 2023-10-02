package Exception_hw_3;

        import java.util.*;
        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;

public class Program {
    public static void main(String[] args) {

        try {
            makeRecord();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makeRecord() throws Exception {
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона (число без разделителей) и пол (символ латиницей f или m), разделенные пробелом");

        String text;
        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.nextLine();
        } catch (Exception e) {
            throw new Exception("Произошла ошибка при работе с консолью");
        }

        String[] array = text.split(" ");
        if (array.length != 6) {
            throw new Exception("Введено неверное количество параметров");
        }

        String surname = array[0];
        String name = array[1];
        String patronymic = array[2];

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date birthdate;
        try {
            birthdate = format.parse(array[3]);
        } catch (ParseException e) {
            throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
        }

        int phone;
        try {
            phone = Integer.parseInt(array[4]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат телефона");
        }

        String sex = array[5];
        if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")) {
            throw new RuntimeException("Неверно введен пол");
        }

        Map<String, List<String>> dataMap = new HashMap<>();

        String data = String.format("%s %s %s %s %s %s", surname, name, patronymic, format.format(birthdate), phone, sex);


        if (dataMap.containsKey(surname)) {

            List<String> dataList = dataMap.get(surname);
            dataList.add(data);
        } else {

            List<String> dataList = new ArrayList<>();
            dataList.add(data);
            dataMap.put(surname, dataList);
        }


        System.out.println("Данные успешно добавлены в словарь:");
        for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey());
            System.out.println("Данные: " + entry.getValue());
        }
    }
}
