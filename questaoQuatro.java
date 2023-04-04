public class questaoQuatro {
    
    public static void main(String[] args) {
        
        double fatSP = 67836.43;
        double fatRJ = 36678.66;
        double fatMG = 29229.88;
        double fatES = 27165.48;
        double fatOthers = 19849.53;
    
        double Total = fatES + fatMG + fatOthers + fatRJ + fatSP;
    
        double pSP = (fatSP / Total) * 100;
        double ptRJ = (fatRJ / Total) * 100;
        double pMG = (fatMG / Total) * 100;
        double pES = (fatES / Total) * 100;
        double pOthers = (fatOthers / Total) * 100;

        System.out.println("SP: " + pSP + "%");
        System.out.println("RJ: " + ptRJ + "%");
        System.out.println("MG: " + pMG + "%");
        System.out.println("ES: " +  pES + "%");
        System.out.println("Outros: " + pOthers + "%");
    }
}
