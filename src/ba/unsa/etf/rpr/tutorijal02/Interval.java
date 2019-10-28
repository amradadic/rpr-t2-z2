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
        Interval interval = new Interval();
        double pTacka, kTacka;
        boolean pTackaUkljucena, kTackaUkljucena;

        if(i.getPocetnaTacka() > i2.getKrajnjaTacka() || i2.getPocetnaTacka() > i.getKrajnjaTacka()){
            //nema presjeka
            System.out.println("tu sam");
            return interval;}

        if(i.getPocetnaTacka()>i2.getPocetnaTacka()){
            interval.setPocetnaTacka(i.getPocetnaTacka());
            if(i.isPripadaIntervaluPocetna()){
                interval.setPripadaIntervaluPocetna(true);
            }
            else interval.setPripadaIntervaluPocetna(false);
        }

        else if(interval.getPocetnaTacka() < i2.getPocetnaTacka()){
            interval.setPocetnaTacka(i2.getPocetnaTacka());
            if(i2.isPripadaIntervaluPocetna()){
                interval.setPripadaIntervaluPocetna(true);
            }
            else interval.setPripadaIntervaluPocetna(false);

        }

        if(i.getKrajnjaTacka()< i2.getKrajnjaTacka()){
            interval.setKrajnjaTacka(i.getKrajnjaTacka());
            // interval.pocetnaTacka = interval.getPocetnaTacka();
            if(i.isPripadaIntervaluKrajnja()){
                interval.setPripadaIntervaluKrajnja(true);
            }
            else interval.setPripadaIntervaluKrajnja(false);
        }

        else if(i.getKrajnjaTacka()> i2.getKrajnjaTacka()){
            interval.setKrajnjaTacka(i2.getKrajnjaTacka());
            // interval.pocetnaTacka = interval.getPocetnaTacka();
            if(i2.isPripadaIntervaluKrajnja()){
                interval.setPripadaIntervaluKrajnja(true);
            }
            else interval.setPripadaIntervaluKrajnja(false);

        }
        return interval;

    }

    public Interval intersect(Interval i){
        Interval interval = new Interval();
        double pTacka, kTacka;
        boolean pTackaUkljucena, kTackaUkljucena;

        if(i.getPocetnaTacka() > this.getKrajnjaTacka() || this.getPocetnaTacka() > i.getKrajnjaTacka()){
            //nema presjeka
            System.out.println("tu sam");
            return interval;}

        if(i.getPocetnaTacka()>this.getPocetnaTacka()){
            interval.setPocetnaTacka(i.getPocetnaTacka());
            if(i.isPripadaIntervaluPocetna()){
                interval.setPripadaIntervaluPocetna(true);
            }
            else interval.setPripadaIntervaluPocetna(false);
        }

        else if(interval.getPocetnaTacka() < this.getPocetnaTacka()){
            interval.setPocetnaTacka(this.getPocetnaTacka());
            if(this.isPripadaIntervaluPocetna()){
                interval.setPripadaIntervaluPocetna(true);
            }
            else interval.setPripadaIntervaluPocetna(false);

        }

        if(i.getKrajnjaTacka()< this.getKrajnjaTacka()){
            interval.setKrajnjaTacka(i.getKrajnjaTacka());
           // interval.pocetnaTacka = interval.getPocetnaTacka();
            if(i.isPripadaIntervaluKrajnja()){
                interval.setPripadaIntervaluKrajnja(true);
            }
            else interval.setPripadaIntervaluKrajnja(false);
        }

        else if(i.getKrajnjaTacka()> this.getKrajnjaTacka()){
            interval.setKrajnjaTacka(this.getKrajnjaTacka());
            // interval.pocetnaTacka = interval.getPocetnaTacka();
            if(this.isPripadaIntervaluKrajnja()){
                interval.setPripadaIntervaluKrajnja(true);
            }
            else interval.setPripadaIntervaluKrajnja(false);

        }
       /* if(this.pocetnaTacka>=i.pocetnaTacka) {
            pTacka = this.pocetnaTacka;
            if(this.pocetnaTacka == i.pocetnaTacka){

                if(this.pripadaIntervaluPocetna || i.pripadaIntervaluPocetna) pTackaUkljucena=true;
                else pTackaUkljucena = false;
            }
            pTackaUkljucena = this.pripadaIntervaluPocetna;
        }
        else {
            pTacka = i.pocetnaTacka;
            pTackaUkljucena = i.pripadaIntervaluPocetna;
        }


        if(this.krajnjaTacka>=i.krajnjaTacka) {
            kTacka = i.krajnjaTacka;
            if(this.krajnjaTacka == i.krajnjaTacka){

                if(this.pripadaIntervaluKrajnja || i.pripadaIntervaluKrajnja) kTackaUkljucena=true;
                else pTackaUkljucena = false;
            }
            kTackaUkljucena = i.pripadaIntervaluKrajnja;
        }
        else {
            kTacka = this.pocetnaTacka;
            kTackaUkljucena = this.pripadaIntervaluPocetna;
        }

        interval = new Interval(pTacka, kTacka, pTackaUkljucena, kTackaUkljucena);

*/
        return interval;
    }

    public double getPocetnaTacka() {
        return pocetnaTacka;
    }

    public void setPocetnaTacka(double pocetnaTacka) {
        this.pocetnaTacka = pocetnaTacka;
    }

    public double getKrajnjaTacka() {
        return krajnjaTacka;
    }

    public void setKrajnjaTacka(double krajnjaTacka) {
        this.krajnjaTacka = krajnjaTacka;
    }

    public boolean isPripadaIntervaluPocetna() {
        return pripadaIntervaluPocetna;
    }

    public void setPripadaIntervaluPocetna(boolean pripadaIntervaluPocetna) {
        this.pripadaIntervaluPocetna = pripadaIntervaluPocetna;
    }

    public boolean isPripadaIntervaluKrajnja() {
        return pripadaIntervaluKrajnja;
    }

    public void setPripadaIntervaluKrajnja(boolean pripadaIntervaluKrajnja) {
        this.pripadaIntervaluKrajnja = pripadaIntervaluKrajnja;
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
