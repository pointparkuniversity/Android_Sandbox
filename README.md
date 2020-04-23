# Android_Sandbox -- Sammy's Branch
This is a sandbox that will be used during the semester, while we learn to program for Android

## Here's the list of things accomplished on theses sections for the Family House Android app.

- FAQ 
- Linens
- Contact


> **NOTE** The Linens and FAQ are harded coded for now! It will later be revised for API input and will finalize before published on the android app store.


## Linens

- The Linens page is pretty similar to the iOS version. Expect, the Android only have the fill in the blanket for text columns of linens request section

---
```java
//The values are added to indicate that each EditText captures public of each linens request section

showGuest = (EditText) findViewById(R.id.guestValue);
        showBlanket = (EditText) findViewById(R.id.blanketValue);
        showTowels = (EditText) findViewById(R.id.towelValue);
        showCloth = (EditText) findViewById(R.id.washValue);
        showBath = (EditText) findViewById(R.id.bathValue);
        showBlue = (EditText) findViewById(R.id.blueValue);
        showTwin = (EditText) findViewById(R.id.twinValue);
        showQueen = (EditText) findViewById(R.id.queenValue);
```
- Here's the public class code added as well as the EditText functionality
```java
//This the EditText explained above that is use and explained
    EditText showGuest;
    int guest = 0;

    EditText showBlanket;
    int blanket = 0;

    EditText showTowels;
    int towel = 0;

    EditText showCloth;
    int wash = 0;

    EditText showBath;
    int bath = 0;

    EditText showBlue;
    int blue = 0;

    EditText showTwin;
    int twin =  0;

    EditText showQueen;
    int queen = 0;

    .....
  
    public void guestIN (View view) {
        guest++;
        showGuest.setText(Integer.toString(guest));
    }

    public void blanketIN (View view) {
        blanket++;
        showBlanket.setText(Integer.toString(blanket));
    }

    public void towelIN (View view) {
        towel++;
        showTowels.setText(Integer.toString(towel));
    }

    public void clothIN (View view) {
        wash++;
        showCloth.setText(Integer.toString(wash));
    }

    public void bathmatIN (View view) {
        bath++;
        showBath.setText(Integer.toString(bath));
    }

    public void bluebagIN (View view) {
        blue++;
        showBlue.setText(Integer.toString(blue));
    }

    public void twinIN (View view) {
        twin++;
        showTwin.setText(Integer.toString(twin));
    }

    public void queenIN (View view) {
        queen++;
        showQueen.setText(Integer.toString(queen));
    }

    public void guestDE (View view) {
        guest--;
        showGuest.setText(Integer.toString(guest));
    }

    public void blanketDE (View view) {
        blanket--;
        showBlanket.setText(Integer.toString(blanket));
    }

    public void towelDE (View view) {
        towel--;
        showTowels.setText(Integer.toString(towel));
    }

    public void clothDE (View view) {
        wash--;
        showCloth.setText(Integer.toString(wash));
    }

    public void bathmatDE (View view) {
        bath--;
        showBath.setText(Integer.toString(bath));
    }

    public void bluebagDE (View view) {
        blue--;
        showBlue.setText(Integer.toString(blue));
    }

    public void twinDE (View view) {
        twin--;
        showTwin.setText(Integer.toString(twin));
    }

    public void queenDE (View view) {
        queen--;
        showQueen.setText(Integer.toString(queen));
    }
```
- Here is the XML example listed:
```xml
//This example shows that blanketValue is added as an id to connect the EditText function along with the assign public class that they are with.
<EditText
        android:id="@+id/blanketValue"
        android:layout_width="40dp"
        android:layout_height="42dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="0"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.253"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.483" />

//Minus-Blanket
```xml

 <Button
        android:id="@+id/button15" 
        android:layout_width="40dp"
        android:layout_height="42dp"
        android:backgroundTint="#AEB7B6"
        android:onClick="blanketDE" //the click button for the minus feature is connected to The Public class blanketDE (Stands for Decrease)
        android:text="-"
        android:textColor="#000000"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.099"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.483" />

    <Button
        android:id="@+id/button17"
        android:layout_width="40dp"
        android:layout_height="42dp"
        android:backgroundTint="#AEB7B6"
        android:onClick="blanketIN" //the click button for the added feature is connected to The Public class blanketIN (stands for Increase)
        android:text="+"
        android:textColor="#000000"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.396"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.483" />
```
- Here's the __Contact Page__!
---
![Linens](https://sabdul.it.pointpark.edu/linens.png)
---
