import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Bill extends JFrame implements ActionListener {
    String cvb,vcb,prb,ccb,fcb,it,p,m,bs,cs,crf,chf,chkf,ccw,bcw,fc,hcv,hcn,cdv,cdn;
    JButton close;
    int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20;
    String customerid;
    JLabel order1,order2,order3,order4,order5,order6,order7,order8,order9,order10,order11,order12,order13,order14,order15,order16,order17,order18,order19,order20;
    JLabel price1,price2,price3,price4,price5,price6,price7,price8,price9,price10,price11,price12,price13,price14,price15,price16,price17,price18,price19,price20;
    JLabel qty1,qty2,qty3,qty4,qty5,qty6,qty7,qty8,qty9,qty10,qty11,qty12,qty13,qty14,qty15,qty16,qty17,qty18,qty19,qty20;
    Bill(String customerid){
        this.customerid = customerid;
        setLayout(null);

        JLabel bill = new JLabel("Your Bill: ");
        bill.setFont(new Font("SansSerif", Font.BOLD,32 ));
        bill.setBounds(350, 10, 250, 40);
        add(bill);

        JLabel item = new JLabel("Items:");
        item.setFont(new Font("Serif", Font.BOLD, 18));
        item.setBounds(150,60,200,30);
        add(item);

        JLabel qty = new JLabel("Qty:");
        qty.setFont(new Font("Serif", Font.BOLD, 18));
        qty.setBounds(392,60,200,30);
        add(qty);

        JLabel price = new JLabel("Price:");
        price.setFont(new Font("Serif", Font.BOLD, 18));
        price.setBounds(650,60,200,30);
        add(price);

        order1 = new JLabel("Crispy Veg Burger");
        order1.setFont(new Font("Serif", Font.ITALIC, 18));
        order1.setBounds(100,90,220,30);
        add(order1);

        qty1 = new JLabel("5");
        qty1.setFont(new Font("Serif", Font.ITALIC, 18));
        qty1.setBounds(402,90,200,30);
        add(qty1);

        price1 = new JLabel("$199");
        price1.setFont(new Font("Serif", Font.ITALIC, 18));
        price1.setBounds(651,90,200,30);
        add(price1);

        order2 = new JLabel("Veg Cheese Burger");
        order2.setFont(new Font("Serif", Font.ITALIC, 18));
        order2.setBounds(100,120,220,30);
        add(order2);

        qty2 = new JLabel("5");
        qty2.setFont(new Font("Serif", Font.ITALIC, 18));
        qty2.setBounds(402,120,200,30);
        add(qty2);

        price2 = new JLabel("$199");
        price2.setFont(new Font("Serif", Font.ITALIC, 18));
        price2.setBounds(651,120,200,30);
        add(price2);

        order3 = new JLabel("Paneer Royal Burger");
        order3.setFont(new Font("Serif", Font.ITALIC, 18));
        order3.setBounds(100,150,220,30);
        add(order3);

        qty3 = new JLabel("5");
        qty3.setFont(new Font("Serif", Font.ITALIC, 18));
        qty3.setBounds(402,150,200,30);
        add(qty3);

        price3 = new JLabel("$199");
        price3.setFont(new Font("Serif", Font.ITALIC, 18));
        price3.setBounds(651,150,200,30);
        add(price3);

        order4 = new JLabel("Crispy Chicken Burger");
        order4.setFont(new Font("Serif", Font.ITALIC, 18));
        order4.setBounds(100,180,220,30);
        add(order4);

        qty4 = new JLabel("5");
        qty4.setFont(new Font("Serif", Font.ITALIC, 18));
        qty4.setBounds(402,180,200,30);
        add(qty4);

        price4 = new JLabel("$199");
        price4.setFont(new Font("Serif", Font.ITALIC, 18));
        price4.setBounds(651,180,200,30);
        add(price4);

        order5 = new JLabel("Fiery Chicken Burger");
        order5.setFont(new Font("Serif", Font.ITALIC, 18));
        order5.setBounds(100,210,220,30);
        add(order5);

        qty5 = new JLabel("5");
        qty5.setFont(new Font("Serif", Font.ITALIC, 18));
        qty5.setBounds(402,210,220,30);
        add(qty5);

        price5 = new JLabel("$199");
        price5.setFont(new Font("Serif", Font.ITALIC, 18));
        price5.setBounds(651,210,200,30);
        add(price5);

        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        order6 = new JLabel("Ice Tea");
        order6.setFont(new Font("Serif", Font.ITALIC, 18));
        order6.setBounds(100,240,220,30);
        add(order6);

        qty6 = new JLabel("5");
        qty6.setFont(new Font("Serif", Font.ITALIC, 18));
        qty6.setBounds(402,240,220,30);
        add(qty6);

        price6 = new JLabel("$199");
        price6.setFont(new Font("Serif", Font.ITALIC, 18));
        price6.setBounds(651,240,200,30);
        add(price6);

        order7 = new JLabel("Pepsi 250ml");
        order7.setFont(new Font("Serif", Font.ITALIC, 18));
        order7.setBounds(100,270,220,30);
        add(order7);

        qty7 = new JLabel("5");
        qty7.setFont(new Font("Serif", Font.ITALIC, 18));
        qty7.setBounds(402,270,200,30);
        add(qty7);

        price7 = new JLabel("$199");
        price7.setFont(new Font("Serif", Font.ITALIC, 18));
        price7.setBounds(651,270,200,30);
        add(price7);

        order8 = new JLabel("Mirinda 250ml");
        order8.setFont(new Font("Serif", Font.ITALIC, 18));
        order8.setBounds(100,300,220,30);
        add(order8);

        qty8 = new JLabel("5");
        qty8.setFont(new Font("Serif", Font.ITALIC, 18));
        qty8.setBounds(402,300,220,30);
        add(qty8);

        price8 = new JLabel("$199");
        price8.setFont(new Font("Serif", Font.ITALIC, 18));
        price8.setBounds(651,300,200,30);
        add(price8);

        order9 = new JLabel("Chocolate Shake");
        order9.setFont(new Font("Serif", Font.ITALIC, 18));
        order9.setBounds(100,330,220,30);
        add(order9);

        qty9 = new JLabel("5");
        qty9.setFont(new Font("Serif", Font.ITALIC, 18));
        qty9.setBounds(402,330,200,30);
        add(qty9);

        price9 = new JLabel("$199");
        price9.setFont(new Font("Serif", Font.ITALIC, 18));
        price9.setBounds(651,330,200,30);
        add(price9);

        order10 = new JLabel("Berry Shake");
        order10.setFont(new Font("Serif", Font.ITALIC, 18));
        order10.setBounds(100,360,220,30);
        add(order10);

        qty10 = new JLabel("5");
        qty10.setFont(new Font("Serif", Font.ITALIC, 18));
        qty10.setBounds(402,360,220,30);
        add(qty10);

        price10 = new JLabel("$199");
        price10.setFont(new Font("Serif", Font.ITALIC, 18));
        price10.setBounds(651,360,200,30);
        add(price10);

        order11 = new JLabel("Crispy Fries");
        order11.setFont(new Font("Serif", Font.ITALIC, 18));
        order11.setBounds(100,390,220,30);
        add(order11);

        qty11 = new JLabel("5");
        qty11.setFont(new Font("Serif", Font.ITALIC, 18));
        qty11.setBounds(402,390,220,30);
        add(qty11);

        price11 = new JLabel("$199");
        price11.setFont(new Font("Serif", Font.ITALIC, 18));
        price11.setBounds(651,390,200,30);
        add(price11);

        order12 = new JLabel("Cheesy Fries");
        order12.setFont(new Font("Serif", Font.ITALIC, 18));
        order12.setBounds(100,420,220,30);
        add(order12);

        qty12 = new JLabel("5");
        qty12.setFont(new Font("Serif", Font.ITALIC, 18));
        qty12.setBounds(402,420,220,30);
        add(qty12);

        price12 = new JLabel("$199");
        price12.setFont(new Font("Serif", Font.ITALIC, 18));
        price12.setBounds(651,420,200,30);
        add(price12);

        order13 = new JLabel("Chicken Fries");
        order13.setFont(new Font("Serif", Font.ITALIC, 18));
        order13.setBounds(100,450,220,30);
        add(order13);

        qty13 = new JLabel("5");
        qty13.setFont(new Font("Serif", Font.ITALIC, 18));
        qty13.setBounds(402,450,220,30);
        add(qty13);

        price13 = new JLabel("$199");
        price13.setFont(new Font("Serif", Font.ITALIC, 18));
        price13.setBounds(651,450,200,30);
        add(price13);

        order14 = new JLabel("Crispy Chicken Wings");
        order14.setFont(new Font("Serif", Font.ITALIC, 18));
        order14.setBounds(100,480,220,30);
        add(order14);

        qty14 = new JLabel("5");
        qty14.setFont(new Font("Serif", Font.ITALIC, 18));
        qty14.setBounds(402,480,220,30);
        add(qty14);

        price14 = new JLabel("$199");
        price14.setFont(new Font("Serif", Font.ITALIC, 18));
        price14.setBounds(651,480,200,30);
        add(price14);

        order15 = new JLabel("Boneless Chicken Wings");
        order15.setFont(new Font("Serif", Font.ITALIC, 18));
        order15.setBounds(100,510,220,30);
        add(order15);

        qty15 = new JLabel("5");
        qty15.setFont(new Font("Serif", Font.ITALIC, 18));
        qty15.setBounds(402,510,200,30);
        add(qty15);

        price15 = new JLabel("$199");
        price15.setFont(new Font("Serif", Font.ITALIC, 18));
        price15.setBounds(651,510,200,30);
        add(price15);

        order16 = new JLabel("Fiery Combo");
        order16.setFont(new Font("Serif", Font.ITALIC, 18));
        order16.setBounds(100,540,220,30);
        add(order16);

        qty16 = new JLabel("5");
        qty16.setFont(new Font("Serif", Font.ITALIC, 18));
        qty16.setBounds(402,540,200,30);
        add(qty16);

        price16 = new JLabel("$199");
        price16.setFont(new Font("Serif", Font.ITALIC, 18));
        price16.setBounds(651,540,200,30);
        add(price16);

        order17 = new JLabel("Hattrick Combo Veg");
        order17.setFont(new Font("Serif", Font.ITALIC, 18));
        order17.setBounds(100,570,220,30);
        add(order17);

        qty17 = new JLabel("5");
        qty17.setFont(new Font("Serif", Font.ITALIC, 18));
        qty17.setBounds(402,570,200,30);
        add(qty17);

        price17 = new JLabel("$199");
        price17.setFont(new Font("Serif", Font.ITALIC, 18));
        price17.setBounds(651,570,200,30);
        add(price17);

        order18 = new JLabel("Hattrick Combo Nonveg");
        order18.setFont(new Font("Serif", Font.ITALIC, 18));
        order18.setBounds(100,600,220,30);
        add(order18);

        qty18 = new JLabel("5");
        qty18.setFont(new Font("Serif", Font.ITALIC, 18));
        qty18.setBounds(402,600,200,30);
        add(qty18);

        price18 = new JLabel("$199");
        price18.setFont(new Font("Serif", Font.ITALIC, 18));
        price18.setBounds(651,600,200,30);
        add(price18);

        order19 = new JLabel("Classic Duo Veg");
        order19.setFont(new Font("Serif", Font.ITALIC, 18));
        order19.setBounds(100,630,220,30);
        add(order19);

        qty19 = new JLabel("5");
        qty19.setFont(new Font("Serif", Font.ITALIC, 18));
        qty19.setBounds(402,630,200,30);
        add(qty19);

        price19 = new JLabel("$199");
        price19.setFont(new Font("Serif", Font.ITALIC, 18));
        price19.setBounds(651,630,200,30);
        add(price19);

        order20 = new JLabel("Classic Duo NonVeg");
        order20.setFont(new Font("Serif", Font.ITALIC, 18));
        order20.setBounds(100,660,220,30);
        add(order20);

        qty20 = new JLabel("5");
        qty20.setFont(new Font("Serif", Font.ITALIC, 18));
        qty20.setBounds(402,660,200,30);
        add(qty20);

        price20 = new JLabel("$199");
        price20.setFont(new Font("Serif", Font.ITALIC, 18));
        price20.setBounds(651,660,200,30);
        add(price20);

        JLabel total = new JLabel("Total: $");
        total.setFont(new Font("Serif", Font.BOLD, 26));
        total.setBounds(550, 720, 250, 30);
        add(total);

        close = new JButton("CLOSE");
        close.setForeground(Color.BLACK);
        close.setBackground(Color.WHITE);
        close.setFont(new Font("Serif", Font.BOLD, 26));
        close.setBounds(200, 720, 200, 30);
        close.addActionListener(this);
        add(close);

        try{
            Conn c = new Conn();
            ResultSet rs1 = c.s.executeQuery("SELECT * FROM burgers WHERE customerid = '"+customerid+"'");
//            ResultSet rs2 = c.s.executeQuery("SELECT * FROM beverages WHERE customerid = '"+customerid+"'");
//            ResultSet rs3 = c.s.executeQuery("SELECT * FROM extras WHERE customerid = '"+customerid+"'");
//            ResultSet rs4 = c.s.executeQuery("SELECT * FROM combos WHERE customerid = '"+customerid+"'");

            while(rs1.next()) {
                cvb = rs1.getString("cvb");
                vcb = rs1.getString("vcb");
                prb = rs1.getString("prb");
                ccb = rs1.getString("ccb");
                fcb = rs1.getString("fcb");
            }
            rs1.close();

            ResultSet rs2 = c.s.executeQuery("SELECT * FROM beverages WHERE customerid = '"+customerid+"'");
            while(rs2.next()) {
                it = rs2.getString("it");
                p = rs2.getString("p");
                m = rs2.getString("m");
                bs = rs2.getString("bs");
                cs = rs2.getString("cs");
            }
            rs2.close();

            ResultSet rs3 = c.s.executeQuery("SELECT * FROM extras WHERE customerid = '"+customerid+"'");
            while(rs3.next()) {
                crf = rs3.getString("crf");
                chf = rs3.getString("chf");
                chkf = rs3.getString("chkf");
                ccw = rs3.getString("ccw");
                bcw = rs3.getString("bcw");
            }
            rs3.close();

            ResultSet rs4 = c.s.executeQuery("SELECT * FROM combos WHERE customerid = '"+customerid+"'");
            while(rs4.next()) {
                fc = rs4.getString("fc");
                hcv = rs4.getString("hcv");
                hcn = rs4.getString("hcn");
                cdv = rs4.getString("cdv");
                cdn = rs4.getString("cdn");
            }
            rs4.close();
            if(cvb.equals("0")){
                order1.setVisible(false);
                qty1.setVisible(false);
                price1.setVisible(false);
            }
            else{
                qty1.setText(cvb);
                int qt1 = Integer.parseInt(cvb);
                  p1 = qt1*15;
                price1.setText("$ "+p1);
            }
            if(vcb.equals("0")){
                order2.setVisible(false);
                qty2.setVisible(false);
                price2.setVisible(false);
            }
            else{
                qty2.setText(vcb);
                int qt2 = Integer.parseInt(vcb);
                  p2 = qt2*15;
                price2.setText("$ "+p2);
            }
            if(prb.equals("0")){
                order3.setVisible(false);
                qty3.setVisible(false);
                price3.setVisible(false);
            }
            else{
                qty3.setText(prb);
                int qt3 = Integer.parseInt(prb);
                  p3 = qt3*15;
                price3.setText("$ "+p3);
            }
            if(ccb.equals("0")){
                order4.setVisible(false);
                qty4.setVisible(false);
                price4.setVisible(false);
            }
            else{
                qty4.setText(ccb);
                int qt4 = Integer.parseInt(cvb);
                  p4 = qt4*15;
                price4.setText("$ "+p4);
            }

            if(fcb.equals("0")){
                order5.setVisible(false);
                qty5.setVisible(false);
                price5.setVisible(false);
            }
            else{
                qty5.setText(fcb);
                int qt5 = Integer.parseInt(fcb);
                  p5 = qt5*15;
                price5.setText("$ "+p5);
            }
            if(it.equals("0")){
                order6.setVisible(false);
                qty6.setVisible(false);
                price6.setVisible(false);
            }
            else{
                qty6.setText(it);
                int qt6 = Integer.parseInt(it);
                  p6 = qt6*15;
                price6.setText("$ "+p6);
            }
            if(p.equals("0")){
                order7.setVisible(false);
                qty7.setVisible(false);
                price7.setVisible(false);
            }
            else{
                qty7.setText(p);
                int qt7 = Integer.parseInt(p);
                  p7 = qt7*15;
                price7.setText("$ "+p7);
            }
            if(m.equals("0")){
                order8.setVisible(false);
                qty8.setVisible(false);
                price8.setVisible(false);
            }
            else{
                qty8.setText(m);
                int qt8 = Integer.parseInt(m);
                  p8 = qt8*15;
                price8.setText("$ "+p8);
            }
            if(bs.equals("0")){
                order9.setVisible(false);
                qty9.setVisible(false);
                price9.setVisible(false);
            }
            else{
                qty9.setText(bs);
                int qt9 = Integer.parseInt(bs);
                  p9 = qt9*15;
                price9.setText("$ "+p9);
            }
            if(cs.equals("0")){
                order10.setVisible(false);
                qty10.setVisible(false);
                price10.setVisible(false);
            }
            else{
                qty10.setText(cs);
                int qt10 = Integer.parseInt(cs);
                  p10 = qt10*15;
                price10.setText("$ "+p10);
            }
            if(crf.equals("0")){
                order11.setVisible(false);
                qty11.setVisible(false);
                price11.setVisible(false);
            }
            else{
                qty11.setText(crf);
                int qt11 = Integer.parseInt(crf);
                  p11 = qt11*15;
                price11.setText("$ "+p11);
            }
            if(chf.equals("0")){
                order12.setVisible(false);
                qty12.setVisible(false);
                price12.setVisible(false);
            }
            else{
                qty12.setText(chf);
                int qt12 = Integer.parseInt(chf);
                  p12 = qt12*15;
                price12.setText("$ "+p12);
            }
            if(chkf.equals("0")){
                order13.setVisible(false);
                qty13.setVisible(false);
                price13.setVisible(false);
            }
            else{
                qty13.setText(chkf);
                int qt13 = Integer.parseInt(chkf);
                  p13 = qt13*15;
                price13.setText("$ "+p13);
            }
            if(ccw.equals("0")){
                order14.setVisible(false);
                qty14.setVisible(false);
                price14.setVisible(false);
            }
            else{
                qty14.setText(ccw);
                int qt14 = Integer.parseInt(ccw);
                  p14 = qt14*15;
                price14.setText("$ "+p14);
            }
            if(bcw.equals("0")){
                order15.setVisible(false);
                qty15.setVisible(false);
                price15.setVisible(false);
            }
            else{
                qty15.setText(bcw);
                int qt15 = Integer.parseInt(bcw);
                  p15 = qt15*15;
                price15.setText("$ "+p15);
            }
            if(fc.equals("0")){
                order16.setVisible(false);
                qty16.setVisible(false);
                price16.setVisible(false);
            }
            else{
                qty16.setText(fc);
                int qt16 = Integer.parseInt(fc);
                  p16 = qt16*15;
                price16.setText("$ "+p16);
            }
            if(hcv.equals("0")){
                order17.setVisible(false);
                qty17.setVisible(false);
                price17.setVisible(false);
            }
            else{
                qty17.setText(hcv);
                int qt17 = Integer.parseInt(hcv);
                  p17 = qt17*15;
                price17.setText("$ "+p17);
            }
            if(hcn.equals("0")){
                order18.setVisible(false);
                qty18.setVisible(false);
                price18.setVisible(false);
            }
            else{
                qty18.setText(hcn);
                int qt18 = Integer.parseInt(hcn);
                  p18 = qt18*15;
                price18.setText("$ "+p18);
            }
            if(cdv.equals("0")){
                order19.setVisible(false);
                qty19.setVisible(false);
                price19.setVisible(false);
            }
            else{
                qty19.setText(cdv);
                int qt19 = Integer.parseInt(cdv);
                  p19 = qt19*15;
                price19.setText("$ "+p19);
            }
            if(cdn.equals("0")){
                order20.setVisible(false);
                qty20.setVisible(false);
                price20.setVisible(false);
            }
            else{
                qty20.setText(cdn);
                int qt20 = Integer.parseInt(cdn);
                  p20 = qt20*15;
                price20.setText("$ "+p20);
            }

        }catch(Exception e){
            System.out.println("Error is "+e);
        }
        long totalqty = p1+p2+p3+p4+p5+p6+p7+p8 +p9 +p10 +p11 +p12 +p13 +p14 +p15 +p16 +p17 +p18 +p19 +p20;
        total.setText("Total: $ "+totalqty);

        getContentPane().setBackground(Color.white);
        setSize(850 ,900);
        setLocation(350,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
//        try{
//            Conn c = new Conn();
//            ResultSet rs1 = c.s.executeQuery("SELECT * FROM burgers WHERE customerid = '"+customerid+"'");
//            ResultSet rs2 = c.s.executeQuery("SELECT * FROM beverages WHERE customerid = '"+customerid+"'");
//            ResultSet rs3 = c.s.executeQuery("SELECT * FROM extras WHERE customerid = '"+customerid+"'");
//            ResultSet rs4 = c.s.executeQuery("SELECT * FROM combos WHERE customerid = '"+customerid+"'");
//
//            cvb = rs1.getString("cvb");
//            vcb = rs1.getString("vcb");
//            prb = rs1.getString("prb");
//            ccb = rs1.getString("ccb");
//            fcb = rs1.getString("fcb");
//
//            it = rs2.getString("it");
//            p = rs2.getString("p");
//            m = rs2.getString("m");
//            bs = rs2.getString("bs");
//            cs = rs2.getString("cs");
//
//            crf = rs3.getString("crf");
//            chf = rs3.getString("chf");
//            chkf = rs3.getString("chkf");
//            ccw = rs3.getString("ccw");
//            bcw = rs3.getString("bcw");
//
//            fc = rs4.getString("fc");
//            hcv = rs4.getString("hcv");
//            hcn = rs4.getString("hcn");
//            cdv = rs4.getString("cdv");
//            cdn = rs4.getString("cdn");
//
//            if(cvb.equals("0")){
//                order1.setVisible(false);
//                qty1.setVisible(false);
//                price1.setVisible(false);
//            }
//            else{
//                qty1.setText(cvb);
//                int qt1 = Integer.parseInt(cvb);
//                int p1 = qt1*15;
//                price1.setText(""+p1);
//            }
//            if(vcb.equals("0")){
//                order2.setVisible(false);
//                qty2.setVisible(false);
//                price2.setVisible(false);
//            }
//            else{
//                qty2.setText(vcb);
//                int qt2 = Integer.parseInt(vcb);
//                int p2 = qt2*15;
//                price2.setText(""+p2);
//            }
//            if(prb.equals("0")){
//                order3.setVisible(false);
//                qty3.setVisible(false);
//                price3.setVisible(false);
//            }
//            else{
//                qty3.setText(prb);
//                int qt3 = Integer.parseInt(prb);
//                int p3 = qt3*15;
//                price3.setText(""+p3);
//            }
//            if(ccb.equals("0")){
//                order4.setVisible(false);
//                qty4.setVisible(false);
//                price4.setVisible(false);
//            }
//            else{
//                qty4.setText(ccb);
//                int qt4 = Integer.parseInt(cvb);
//                int p4 = qt4*15;
//                price4.setText(""+p4);
//            }
//
//                if(fcb.equals("0")){
//                    order5.setVisible(false);
//                    qty5.setVisible(false);
//                    price5.setVisible(false);
//                }
//                else{
//                    qty5.setText(fcb);
//                    int qt5 = Integer.parseInt(fcb);
//                    int p5 = qt5*15;
//                    price5.setText(""+p5);
//                }
//                if(it.equals("0")){
//                    order6.setVisible(false);
//                    qty6.setVisible(false);
//                    price6.setVisible(false);
//                }
//                else{
//                    qty6.setText(it);
//                    int qt6 = Integer.parseInt(it);
//                    int p6 = qt6*15;
//                    price6.setText(""+p6);
//                }
//                if(p.equals("0")){
//                    order7.setVisible(false);
//                    qty7.setVisible(false);
//                    price7.setVisible(false);
//                }
//                else{
//                    qty7.setText(p);
//                    int qt7 = Integer.parseInt(p);
//                    int p7 = qt7*15;
//                    price7.setText(""+p7);
//                }
//                if(m.equals("0")){
//                    order8.setVisible(false);
//                    qty8.setVisible(false);
//                    price8.setVisible(false);
//                }
//                else{
//                    qty8.setText(m);
//                    int qt8 = Integer.parseInt(m);
//                    int p8 = qt8*15;
//                    price8.setText(""+p8);
//                }
//                if(cs.equals("0")){
//                    order9.setVisible(false);
//                    qty9.setVisible(false);
//                    price9.setVisible(false);
//                }
//                else{
//                    qty9.setText(cs);
//                    int qt9 = Integer.parseInt(cs);
//                    int p9 = qt9*15;
//                    price9.setText(""+p9);
//                }
//                if(bs.equals("0")){
//                    order10.setVisible(false);
//                    qty10.setVisible(false);
//                    price10.setVisible(false);
//                }
//                else{
//                    qty10.setText(bs);
//                    int qt10 = Integer.parseInt(bs);
//                    int p10 = qt10*15;
//                    price10.setText(""+p10);
//                }
//                if(crf.equals("0")){
//                    order11.setVisible(false);
//                    qty11.setVisible(false);
//                    price11.setVisible(false);
//                }
//                else{
//                    qty11.setText(crf);
//                    int qt11 = Integer.parseInt(crf);
//                    int p11 = qt11*15;
//                    price11.setText(""+p11);
//                }
//                if(chf.equals("0")){
//                    order12.setVisible(false);
//                    qty12.setVisible(false);
//                    price12.setVisible(false);
//                }
//                else{
//                    qty12.setText(chf);
//                    int qt12 = Integer.parseInt(chf);
//                    int p12 = qt12*15;
//                    price12.setText(""+p12);
//                }
//                if(chkf.equals("0")){
//                    order13.setVisible(false);
//                    qty13.setVisible(false);
//                    price13.setVisible(false);
//                }
//                else{
//                    qty13.setText(chkf);
//                    int qt13 = Integer.parseInt(chkf);
//                    int p13 = qt13*15;
//                    price13.setText(""+p13);
//                }
//                if(ccw.equals("0")){
//                    order14.setVisible(false);
//                    qty14.setVisible(false);
//                    price14.setVisible(false);
//                }
//                else{
//                    qty14.setText(ccw);
//                    int qt14 = Integer.parseInt(ccw);
//                    int p14 = qt14*15;
//                    price14.setText(""+p14);
//                }
//                if(bcw.equals("0")){
//                    order15.setVisible(false);
//                    qty15.setVisible(false);
//                    price15.setVisible(false);
//                }
//                else{
//                    qty15.setText(bcw);
//                    int qt15 = Integer.parseInt(bcw);
//                    int p15 = qt15*15;
//                    price15.setText(""+p15);
//                }
//                if(fc.equals("0")){
//                    order16.setVisible(false);
//                    qty16.setVisible(false);
//                    price16.setVisible(false);
//                }
//                else{
//                    qty16.setText(fc);
//                    int qt16 = Integer.parseInt(fc);
//                    int p16 = qt16*15;
//                    price16.setText(""+p16);
//                }
//                if(hcv.equals("0")){
//                    order17.setVisible(false);
//                    qty17.setVisible(false);
//                    price17.setVisible(false);
//                }
//                else{
//                    qty17.setText(hcv);
//                    int qt17 = Integer.parseInt(hcv);
//                    int p17 = qt17*15;
//                    price17.setText(""+p17);
//                }
//                if(hcn.equals("0")){
//                    order18.setVisible(false);
//                    qty18.setVisible(false);
//                    price18.setVisible(false);
//                }
//                else{
//                    qty18.setText(hcn);
//                    int qt18 = Integer.parseInt(hcn);
//                    int p18 = qt18*15;
//                    price18.setText(""+p18);
//                }
//                if(cdv.equals("0")){
//                    order19.setVisible(false);
//                    qty19.setVisible(false);
//                    price19.setVisible(false);
//                }
//                else{
//                    qty19.setText(cdv);
//                    int qt19 = Integer.parseInt(cdv);
//                    int p19 = qt19*15;
//                    price19.setText(""+p19);
//                }
//                if(cdn.equals("0")){
//                    order20.setVisible(false);
//                    qty20.setVisible(false);
//                    price20.setVisible(false);
//                }
//                else{
//                    qty20.setText(cdn);
//                    int qt20 = Integer.parseInt(cdn);
//                    int p20 = qt20*15;
//                    price20.setText(""+p20);
//                }
//
//        }catch(Exception e){
//            System.out.println("Error is "+e);
//        }
        if (ae.getSource() == close) {
            try {
//                Conn c = new Conn();
//                String s1 = "TRUNCATE TABLE burgers";
//                String s2 = "TRUNCATE TABLE beverages";
//                String s3 = "TRUNCATE TABLE extras";
//                String s4 = "TRUNCATE TABLE combos";
//                c.s.executeUpdate(s1);
//                c.s.executeUpdate(s2);
//                c.s.executeUpdate(s3);
//                c.s.executeUpdate(s4);
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Error is "+e);
            }
        }
    }

    public static void main(String[] args) {
        new Bill("");
    }
}
