package com.example.ebad.cvnt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.StringTokenizer;


public class MainActivity extends Activity {
    String text = "(";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testing_layout);


        Button zero = (Button)findViewById(R.id.button_0);
        Button one = (Button)findViewById(R.id.button_1);
        Button two = (Button)findViewById(R.id.button_2);
        Button three = (Button)findViewById(R.id.button_3);
        Button four = (Button)findViewById(R.id.button_4);
        Button five = (Button)findViewById(R.id.button_5);
        Button six = (Button)findViewById(R.id.button_6);
        Button seven = (Button)findViewById(R.id.button_7);
        Button eight = (Button)findViewById(R.id.button_8);
        Button nine = (Button)findViewById(R.id.button_9);
        Button iorta = (Button)findViewById(R.id.button_i);
        Button plus = (Button)findViewById(R.id.button_plus);
        Button minus = (Button)findViewById(R.id.button_minus);
        Button divide = (Button)findViewById(R.id.button_div);
        Button multiply = (Button)findViewById(R.id.button_multi);
        Button Imaginary = (Button)findViewById(R.id.button_im);
        Button Real = (Button)findViewById(R.id.button_real);
        Button Backspace = (Button)findViewById(R.id.button_back);
        Button Equal = (Button)findViewById(R.id.button_equal);

        zero.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(0";
                        }
                        else {
                            text += "0";
                        }

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );

        one.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(1";
                        }
                        else {
                            text += "1";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        two.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(2";
                        }
                        else {
                            text += "2";
                        }

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        three.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(3";
                        }
                        else {
                            text += "3";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        four.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(4";
                        }
                        else {
                            text += "4";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        five.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(5";
                        }
                        else {
                            text += "5";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        six.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(6";
                        }
                        else {
                            text += "6";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        seven.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(7";
                        }
                        else {
                            text += "7";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        eight.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(8";
                        }
                        else {
                            text += "8";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        nine.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.equals(""))
                        {
                            text+="(9";
                        }
                        else {
                            text += "9";
                        }
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        Backspace.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        String textInBox = anstext.getText().toString();

                        if(textInBox.length() > 0)
                        {
                            String newText = textInBox.substring(0, textInBox.length()-1);

                            anstext.setText(newText);
                            text = newText;
                        }
                    }

                }
        );

        iorta.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        text +="i)";
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );

        plus.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v)
                    {
                        if(text.endsWith("i)")) {

                           text += " + (";
                        }
                        else {
                            text += " + ";
                        }

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }


                }
        );
        minus.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.endsWith("i)")) {

                            text += " - (";
                        }
                        else {
                            text += " - ";
                        }

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        divide.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        if(text.endsWith("i)")) {

                            text += " / (";
                        }
                        else {
                            text += " / ";
                        }

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );
        multiply.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(text.endsWith("i)")) {

                            text += " x (";
                        }
                        else {
                            text += " x ";
                        }

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(text);
                    }

                }
        );

        Equal.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        String answer  = "";
                        String tempx = "";
                        String answer2 = "";

                        String texte = text;
                        String temp[] = new String[2];

                        String eb[] = new String[3];
                        String sa[] = new String[4];

                        String n1 = "";
                        String n2 = "";
                        String op1 = "";
                        String op2 = "";
                        String op3 = "";
                        String s1 = "";
                        String s2 = "";

                        double x1 = 0.0;
                        double x2 = 0.0;
                        double  y1 = 0.0;;
                        double  y2 = 0.0;

                        double temp1 = 0.0;
                        double temp2 = 0.0;
                        double temp3 =0.0;
                        double temp4 = 0.0;
                        double tempe1 = 0.0;
                        double tempe2 = 0.0;


                        char nop,sop,mop;



                        StringTokenizer token = new StringTokenizer(text,"i)",false);
                        int count = 0;

                        while(token.hasMoreTokens())
                        {
                            temp[count] = token.nextToken();
                            count++;
                        }

                        temp[0] = temp[0].replace("(","");
                        temp[1] = temp[1].replace("(","");

                        for(int i=0;i<2;i++)
                        {

                            StringTokenizer token1 = new StringTokenizer(temp[i]," ",false);
                            int count1 = 0;

                            while(token1.hasMoreTokens())
                            {
                                if(i==0)
                                {
                                    eb[count1] = token1.nextToken();
                                    count1++;
                                }
                                else if(i==1)
                                {
                                    sa[count1] = token1.nextToken();
                                    count1++;
                                }
                            }

                        }

                        n1 += eb[0];
                        op1 += eb[1];
                        s1 +=eb[2];

                        op3 +=sa[0];
                        n2 = sa[1];
                        op2+=sa[2];
                        s2 = sa[3];

                        x1 = Double.parseDouble(n1);
                        y1 = Double.parseDouble(s1);

                        x2 = Double.parseDouble(n2);
                        y2 = Double.parseDouble(s2);

                        if(op1.equals("-"))
                        {
                            y1 = y1*-1;
                        }

                        if(op2.equals("-"))
                        {
                            y2 = y2*-1;
                        }



                        if(op3.equals("+"))
                        {
                            x1 = x1+x2;
                            y1 = y1+y2;
                            tempx +=y1;

                            if(tempx.startsWith("-"))
                            {
                                answer+=x1+" "+y1+"i";
                            }
                            else
                            {
                                answer+=x1+" + "+y1+"i";
                            }

                            TextView anstext = (TextView)findViewById(R.id.Answer);
                            anstext.setText(answer);

                        }
                        else if(op3.equals("-"))
                        {
                            x1 = x1-x2;
                            y1 = y1-y2;
                            tempx+=y1;

                            if(tempx.startsWith("-"))
                            {
                                answer+=x1+" "+y1+"i";
                            }
                            else
                            {
                                answer+=x1+" + "+y1+"i";
                            }

                            TextView anstext = (TextView)findViewById(R.id.Answer);
                            anstext.setText(answer);
                        }


                        else if(op3.equals("x"))
                        {
                            temp1 = x1*x2;
                            temp2 = x1*y2;
                            temp3 = y1*x2;
                            temp4 = y1*y2;

                            temp4 = temp4*(-1);


                            temp2 = temp2+temp3;
                            temp1 = temp1+(temp4);

                            tempx+=temp2;

                            if(tempx.startsWith("-"))
                            {
                                answer+=temp1+" "+temp2+"i";
                            }
                            else
                            {
                                answer+=temp1+" + "+temp2+"i";

                            }

                            TextView anstext = (TextView)findViewById(R.id.Answer);
                            anstext.setText(answer);
                        }


                        else if(op3.equals("/"))
                        {
                            tempe1 = x2*x2;
                            tempe2 = y2*y2;
                            tempe1 = tempe1-tempe2;


                            y2 = y2*(-1);

                            temp1 = x1*x2;
                            temp2 = x1*y2;
                            temp3 = y1*x2;
                            temp4 = y1*y2;

                            temp4 = temp4*(-1);

                            temp2 = temp2+temp3;
                            temp1 = temp1+(temp4);

                            tempx+=temp2;

                            if(tempx.startsWith("-"))
                            {
                                answer+=temp1+" "+temp2+"i";
                            }
                            else
                            {
                                answer+=temp1+" + "+temp2+"i";

                            }

                            answer2+=answer+"\n_______\n\n  "+tempe1;

                            TextView anstext = (TextView)findViewById(R.id.Answer);
                            anstext.setText(answer2);

                        }
                    }

                }


        );

        Real.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        String texte = text;

                        String temp[] = new String[1];
                        String eb[] = new String[3];
                        String answer = "";


                        StringTokenizer token = new StringTokenizer(texte,"i)",false);
                        int count = 0;

                        while(token.hasMoreTokens())
                        {
                            temp[count] = token.nextToken();
                            count++;
                        }

                        temp[0] = temp[0].replace("(","");

                        StringTokenizer token1 = new StringTokenizer(temp[0]," ",false);
                        int count1 = 0;

                        while(token1.hasMoreTokens())
                        {
                            eb[count1] = token1.nextToken();
                            count1++;
                        }

                        double real1;
                        real1 = Double.parseDouble(eb[0]);

                        answer+= real1;
                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(answer);

                    }

                }
        );


        Imaginary.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        String texte = text;

                        String temp[] = new String[1];
                        String eb[] = new String[3];
                        String answer = "";


                        StringTokenizer token = new StringTokenizer(texte,"i)",false);
                        int count = 0;

                        while(token.hasMoreTokens())
                        {
                            temp[count] = token.nextToken();
                            count++;
                        }

                        temp[0] = temp[0].replace("(","");

                        StringTokenizer token1 = new StringTokenizer(temp[0]," ",false);
                        int count1 = 0;

                        while(token1.hasMoreTokens())
                        {
                            eb[count1] = token1.nextToken();
                            count1++;
                        }


                        double imaginary1;
                        imaginary1 = Double.parseDouble(eb[2]);

                        if(eb[1].equals("-")&&eb[2]!="0.0")
                        {
                            imaginary1 = imaginary1*-1;
                        }
                        else if(eb[2].equals("0.0"))
                        {
                            imaginary1 = imaginary1;
                        }

                        answer+= imaginary1;

                        TextView anstext = (TextView)findViewById(R.id.Answer);
                        anstext.setText(answer);

                    }

                }
        );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
