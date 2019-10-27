package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    double pocetnaTacka, krajnjaTacka;
    boolean pripadaIntervaluPocetna, pripadaIntervaluKrajnja;

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pripadaIntervaluPocetna, boolean pripadaIntervaluKrajnja) throws IllegalArgumentException {
        if(pocetnaTacka > krajnjaTacka) throw new IllegalArgumentException("Neispravan interval");
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pripadaIntervaluPocetna = pripadaIntervaluPocetna;
        this.pripadaIntervaluKrajnja = pripadaIntervaluKrajnja;
    }

    public Interval() {
        pocetnaTacka=0.0;
        krajnjaTacka=0.0;
        pripadaIntervaluKrajnja=false;
        pripadaIntervaluPocetna=false;
    }

    public static Interval intersect(Interval i, Interval i2) {
        return null;
    }
    public Interval intersect(Interval i){
        return null;
    }

    boolean isNull(){
        boolean zaVratiti = false;
        if(pocetnaTacka == 0.0 && krajnjaTacka == 0.0 )
            zaVratiti  = true;
        else
            zaVratiti= false;
        return zaVratiti;
    }


    public boolean isIn(double v) {
       if(pripadaIntervaluPocetna){
           if(pripadaIntervaluKrajnja){
               if(pocetnaTacka<=v && krajnjaTacka>= v) return true;
               return false;
           }
           else{
               //ne pripada krajnja
               if(pocetnaTacka<=v && krajnjaTacka> v) return true;
               return false;
           }
       }
       else{
           //ne pripada pocetna
           if(pripadaIntervaluKrajnja){
               if(pocetnaTacka<v && krajnjaTacka>= v) return true;
               return false;
           }
           else{
               //ne pripada krajnja
               if(pocetnaTacka<v && krajnjaTacka> v) return true;
               return false;
           }
       }
    }


    @Override
    public boolean equals(Object o) {
        //Interval i = (Interval) o;
        if(this.pocetnaTacka == ((Interval) o).pocetnaTacka && this.krajnjaTacka == ((Interval) o).krajnjaTacka &&
        this.pripadaIntervaluPocetna== ((Interval) o).pripadaIntervaluPocetna
        && this.pripadaIntervaluKrajnja==((Interval) o).pripadaIntervaluKrajnja) return true;
        return false;

    }

    @Override
    public String toString(){
        String s = "";
        if(this.isNull()){
            s="()";
            return s;
        }
        if(pripadaIntervaluPocetna) s+="[";
        else s+="(";
        s+=pocetnaTacka;
        s+=",";
        s+=krajnjaTacka;
        if(pripadaIntervaluKrajnja) s+="]";
        else s+=")";
        return s;
    }

    }
