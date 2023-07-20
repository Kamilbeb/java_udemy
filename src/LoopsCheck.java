public class LoopsCheck {
    public static void main(String[] args) {
        //wypisz liczby z zakresu 1-100 podzielne przez 3
        for(int i=1; i<=100;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
        //odwrocic elementy tablicy [1,3,5,7,0] -> [0,7,5,3,1]
        int[] tab = new int[] {1,3,5,7,0};
        for(int j=0; j<(tab.length/2);j++){
            int temp = tab[j];
            tab[j] = tab[tab.length-1-j];
            tab[tab.length-1-j] = temp;
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }
}
