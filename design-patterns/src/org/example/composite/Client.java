package org.example.composite;

/**
 * Created by Ethan on 2020/10/14 11:10
 */
public class Client {
    public static void main(String[] args) {
        Composite c1 = new Composite("Folder1");
        LeafA     c2 = new LeafA("ImageFile1");
        Composite c3 = new Composite("Folder2");
        LeafA     c4 = new LeafA("ImageFile2");
        LeafA     c5 = new LeafA("ImageFile3");
        LeafB     c6 = new LeafB("TextFile1");

        c1.add(c2);
        c1.add(c3);
        c1.add(c4);

        c3.add(c5);
        c3.add(c6);

        c1.showInfo(0);
    }
}
