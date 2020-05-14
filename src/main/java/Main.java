public class Main {


    public static void main(String args[]){

        String csvData = "Christoph ist ein Hurensohn";
        //TODO Neuestes CSV finden

        //TODO CSV lesen

        //TODO CSV zu JSON

        //Data als http server serven
        try{
            ServerHandler sh = new ServerHandler(csvData);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Loop forever to keep running
        while(true);
    }

    
}
