package logic;

import java.util.LinkedList;
import java.util.List;

public class ItemHolder {

    private List<String> list = new LinkedList<>();

    public void addToList(String name) {
        list.add(name);
    }

    public String getAllItems() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (int i=0; i<list.size(); i++) {
            sb.append("<li><a href=/hello?name=" + list.get(i) + ">" + list.get(i) + "</a></li>\n");
        }
        sb.append("</ul>");
        return sb.toString();
    }

//    public static void main(String[] args) {
//        ItemHolder ih = new ItemHolder();
//        ih.addToList("Tom");
//        ih.addToList("Jerry");
//        ih.addToList("Pluto");
//        System.out.println(ih.getAllItems());
//    }

}
