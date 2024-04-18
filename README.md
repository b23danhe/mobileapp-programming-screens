
# Rapport

Först så skapades en ny klass och layout-fil genom att skapa en ny "Empty Views Activity".
Därefter lades en knapp till som ska kunna kopplas så att en ny activity startas när den klickas.

I filen activity_main.xml skapas knappen `<Button />` med id `android:id="@+id/showHorseButton"`

I MainActivity.java skapas eb binär knapp som sedan kopplas ihop med den knappen som skpades 
i xml-filen. Det görs genom att ange det id som knappen har i xml-filen vilket är "showHorseButton"
`Button horseButton = findViewById(R.id.showHorseButton);`

För att göra så att knappen blir klickbar så implementeras en listener på knappen genom följande kod:
`horseButton.setOnClickListener(new View.OnClickListener() {});`
Denna kodsträng säger att när knappen tryck så ska en ny instans av View skapas. Denna "View" är
i sin tur en Intent som startar en ny activty/screen som i detta fallet är HorseDisplay.java. Den skickar
även över data med `Intent.putExtra()` på följande sätt där `name` och `number`är variabler som blir
tilldelat varsitt värde:
`intent.putExtra("name", "Hoppla Hoppla Skutt");
intent.putExtra("number",42);`

I HorseDisplay.java skapas två widgets av typen TextView om så länge `getIntent().getExtras();` inte 
returnerar ett NULL-värde. Respective TextView kopplas ihop med sitt id genom 
`findViewById(R.id.horseName)` och `findViewById(R.id.horseNumber)` detta för att kunna sätta styling
och vilken storlek respektive TextView ska ha. Det som pressenteras i dessa två TextView är
det värde som variablarna `name` och `number`har blir tilldelade i MainActivity.java. Det görs genom
att anropa variablarna med koden: `nameOnHorse.setText(name);` och `numberOnHorse.setText(""+number);`
som sedan skriver ut i text det värde som variablerna har.

<img src="screen1.png" alt="Screen1" style="width:300px;height:600px;"> <img src="screen2.png" alt="Screen2" style="width:300px;height:600px;">
