package com.example.proyecto1cm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
//import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private lateinit var tVinfoname: TextView
    private lateinit var tVinfoNacimiento: TextView
    private lateinit var tVinfoEdad: TextView
    private lateinit var tVinfoCuenta: TextView
    private lateinit var tVinfoCorreo: TextView
    private lateinit var tVinfoSignoChino: TextView
    private lateinit var imgVsigno: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tVinfoname = findViewById(R.id.tVinfoName)
        tVinfoNacimiento = findViewById(R.id.tVinfoNacimiento)
        tVinfoEdad = findViewById(R.id.tVinfoEdad)
        tVinfoCuenta = findViewById(R.id.tVinfoCuenta)
        tVinfoCorreo = findViewById(R.id.tVinfoCorreo)
        tVinfoSignoChino = findViewById(R.id.tVinfoSignoChino)
        imgVsigno = findViewById(R.id.imgVsigno)


        val bundle = intent.extras

        val usrNameRec = bundle?.getString("user","")
        val ursBrnDay = bundle?.getInt("userbornday",0)
        val ursBrnMonth = bundle?.getInt("userbornmonth",0)
        val ursBrnYear = bundle?.getInt("userbornyear",0)
        val usrCtaRec = bundle?.getInt("usercount",0)
        val usrMailRec = bundle?.getString("usermail","")

        //Toast.makeText(this, "usuario: $usrNameRec, nacio: $ursBrnDay/$ursBrnMonth/$ursBrnYear, cuenta: $usrCtaRec, correo: $usrMailRec",Toast.LENGTH_LONG).show()
        val anio = ursBrnYear!!
        val mesnaci = ursBrnMonth!!
        val dianaci = ursBrnDay!!
        val mesActual = 11
        val hoydia = 21
        val aux = 2021 - anio
        val edad: Int

        tVinfoEdad.text = aux.toString()

        if(mesActual > mesnaci){
            edad = aux
            tVinfoEdad.text = String.format("%d",edad)
        }else if(mesActual < mesnaci){
            edad = aux -1
            tVinfoEdad.text = String.format("%d",edad)
        }else if(mesActual == mesnaci){
            if(hoydia >= dianaci){
                edad = aux
                tVinfoEdad.text = String.format("%d",edad)
            }else{
                edad = aux-1
                tVinfoEdad.text = String.format("%d",edad)
            }
        }


        tVinfoname.text = usrNameRec
        tVinfoNacimiento.text = "${ursBrnDay.toString()}/${ursBrnMonth.toString()}/${ursBrnYear.toString()}"
        tVinfoCuenta.text = usrCtaRec.toString()
        tVinfoCorreo.text = usrMailRec


        if(ursBrnYear == 1924 || ursBrnYear == 1936 || ursBrnYear == 1948 || ursBrnYear == 1960 || ursBrnYear == 1972 || ursBrnYear == 1984 || ursBrnYear == 1996 || ursBrnYear == 2008 || ursBrnYear == 2020){
            tVinfoSignoChino.text = getString(R.string.signorat)
            imgVsigno.setImageResource(R.drawable.rata)
        }else if(ursBrnYear == 1925 || ursBrnYear == 1937 || ursBrnYear == 1949 || ursBrnYear == 1961 || ursBrnYear == 1973 || ursBrnYear == 1985 || ursBrnYear == 1997 || ursBrnYear == 2009 || ursBrnYear == 2021){
            tVinfoSignoChino.text = getString(R.string.signobuey)
            imgVsigno.setImageResource(R.drawable.buey)
        }else if(ursBrnYear == 1926 || ursBrnYear == 1938 || ursBrnYear == 1950 || ursBrnYear == 1962 || ursBrnYear == 1974 || ursBrnYear == 1986 || ursBrnYear == 1998 || ursBrnYear == 2010 || ursBrnYear == 2022 ){
            tVinfoSignoChino.text = getString(R.string.signotiger)
            imgVsigno.setImageResource(R.drawable.tigre)
        }else if(ursBrnYear == 1927 || ursBrnYear == 1939 || ursBrnYear == 1951 || ursBrnYear == 1963 || ursBrnYear == 1975 || ursBrnYear == 1987 || ursBrnYear == 1999 || ursBrnYear == 2011 || ursBrnYear == 2023){
            tVinfoSignoChino.text = getString(R.string.signoconejo)
            imgVsigno.setImageResource(R.drawable.liebre)
        }else if(ursBrnYear == 1928 || ursBrnYear == 1940 || ursBrnYear == 1952 || ursBrnYear == 1976 || ursBrnYear == 1988 || ursBrnYear == 19372000 || ursBrnYear == 2012 || ursBrnYear == 2024){
            tVinfoSignoChino.text = getString(R.string.signodragon)
            imgVsigno.setImageResource(R.drawable.dragon)
        }else if(ursBrnYear == 1929 || ursBrnYear == 1941 || ursBrnYear == 1953 || ursBrnYear == 1965 || ursBrnYear == 1977 || ursBrnYear == 1989 || ursBrnYear == 2001 || ursBrnYear == 2013 || ursBrnYear == 2025){
            tVinfoSignoChino.text = getString(R.string.signoserpt)
            imgVsigno.setImageResource(R.drawable.serpiente)
        }else if(ursBrnYear == 1930 || ursBrnYear == 1942 || ursBrnYear == 1954 || ursBrnYear == 1966 || ursBrnYear == 1978 || ursBrnYear == 1990 || ursBrnYear == 2002 || ursBrnYear == 2014 || ursBrnYear == 2026){
            tVinfoSignoChino.text = getString(R.string.signocabo)
            imgVsigno.setImageResource(R.drawable.caballo)
        }else if(ursBrnYear == 1931 || ursBrnYear == 1943 || ursBrnYear == 1955 || ursBrnYear == 1967 || ursBrnYear == 1979 || ursBrnYear == 1991 || ursBrnYear == 2003 || ursBrnYear == 2015 || ursBrnYear == 2027){
            tVinfoSignoChino.text = getString(R.string.signocabra)
            imgVsigno.setImageResource(R.drawable.cabra)
        }else if(ursBrnYear == 1932 || ursBrnYear == 1944 || ursBrnYear == 1956 || ursBrnYear == 1968 || ursBrnYear == 1980 || ursBrnYear == 1992 || ursBrnYear == 2004 || ursBrnYear == 2016 || ursBrnYear == 2028){
            tVinfoSignoChino.text = getString(R.string.signomono)
            imgVsigno.setImageResource(R.drawable.mono)
        }else if(ursBrnYear == 1933 || ursBrnYear == 1945 || ursBrnYear == 1957 || ursBrnYear == 1969 || ursBrnYear == 1981 || ursBrnYear == 1993 || ursBrnYear == 2005 || ursBrnYear == 2017 || ursBrnYear == 2029){
            tVinfoSignoChino.text = getString(R.string.signogallo)
            imgVsigno.setImageResource(R.drawable.gallo)
        }else if(ursBrnYear == 1934 || ursBrnYear == 1946 || ursBrnYear == 1958 || ursBrnYear == 1970 || ursBrnYear == 1982 || ursBrnYear == 1994 || ursBrnYear == 2006 || ursBrnYear == 2018 || ursBrnYear == 2030){
            tVinfoSignoChino.text = getString(R.string.signodog)
            imgVsigno.setImageResource(R.drawable.perro)
        }else if(ursBrnYear == 1935 || ursBrnYear == 1947 || ursBrnYear == 1959 || ursBrnYear == 1971 || ursBrnYear == 1983 || ursBrnYear == 1995 || ursBrnYear == 2007 || ursBrnYear == 2019 || ursBrnYear == 2031){
            tVinfoSignoChino.text = getString(R.string.signopig)
            imgVsigno.setImageResource(R.drawable.cerdo)
        }

    }
}