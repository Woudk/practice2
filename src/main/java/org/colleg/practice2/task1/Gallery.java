package org.colleg.practice2.task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Gallery {
    private List<Picture> pictures;
    private String name;
    private String article;
    private static HashMap<String, Gallery> instance = new HashMap<>();
    private Gallery (String name) {
        this.name = name;
        this.pictures = new ArrayList<>();
        this.article = "";
    }
    public static Gallery getInstance(String name) {
        if (!instance.containsKey(name)) {
            instance.put(name, new Gallery(name));
        }
        return instance.get(name);
    }
    public boolean addPicture(Picture picture) {
        if (picture != null && !pictures.contains(picture)) {
            pictures.add(picture);
            return true;
        }
        return false;
    }
    public boolean removePicture(Picture picture){
        return pictures.remove(picture);
    }
    public String describePicture(Picture picture) {
        if (pictures.contains(picture)) {
            return picture.toString();
        }
        return "Такої картини не існує";
    }

    public Picture getPicture(String name) {
        for (Picture picture : pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }
    public List<Picture> getPictures() {
        return pictures;
    }
    public long getPictureCount() {
        return pictures.size();
    }
    public String getName() {
        return name;
    }
    public String getArticle() {
        return article;
    }
}
