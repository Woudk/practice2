package org.colleg.practice2.task1;

public class Main {
    public static void main(String[] args) {
        Gallery gallery = Gallery.getInstance("Галерея №1");
        Picture picture1 = new Picture("Мона Ліза", (short) 1503, "Леонардо да Вінчі");
        Picture picture2 = new Picture("Зоряна ніч", (short) 1889, "Вінсент ван Гог");
        Picture picture3 = new Picture("Постійність пам'яті", (short) 1931, "Сальвадор Далі");

        gallery.addPicture(picture1);
        gallery.addPicture(picture2);
        gallery.addPicture(picture3);

        System.out.println("Усі картини з галереї:");
        for (Picture picture : gallery.getPictures()) {
            System.out.println(picture);
        }

        System.out.printf(" Опис картини:");
        System.out.println(gallery.describePicture(picture1));

        gallery.removePicture(picture2);

        System.out.println("Кількість картин після видалення: " + gallery.getPictureCount());
    }
}