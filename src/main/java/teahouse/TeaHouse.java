package teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TeaHouse {
    private String houseName;
    private List<Tea> teaList = new ArrayList<>();
    private LocalTime openTime;
    private LocalTime closeTime;

    public void addTea(Tea tea) {
        teaList.add(tea);
    }

    public String getHouseName() {
        return houseName;
    }

    public List<Tea> getTeas() {
        return teaList;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public TeaHouse(String houseName, LocalTime openTime, LocalTime closeTime) {
        this.houseName = houseName;
        this.openTime = openTime;
        this.closeTime = closeTime;
        teaList.add(new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        teaList.add(new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
    }

    public void setActionPrices(Sort sort, int percent) {
        for (int i = 0; i < teaList.size(); i++) {
            double discount = teaList.get(i).getPrice() * percent / 100d;
            teaList.get(i).setPrice((int) (teaList.get(i).getPrice() - discount));
        }
    }

    public double getAveragePrice() {
        int sum = 0;
        for (int i = 0; i < teaList.size(); i++) {
            sum += teaList.get(i).getPrice();
            System.out.print(i+" ");
            System.out.println(teaList.get(i).getPrice());
            //System.out.println(sum);
        }
        return (double) sum / teaList.size();
    }
}
