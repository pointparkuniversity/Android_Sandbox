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

## FAQ

- The FAQ page is consist of three questions for the general section:
```java
  public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("Family House is a 501(c)(3) non-profit charitable organization greatly supported by community donations whose mission is to. It provides a convenient and affordable “home away from home” for patients and their caregivers who must travel to Pittsburgh for medical treatment of life-threatening illness.");

        List<String> football = new ArrayList<String>();
        football.add("Family House is a 501(c)(3) non-profit charitable organization governed by a community Board of Directors. We rely on donations to support the homes and services provided to all guests. \n" +
                "Family House’s charitable care—which is the difference between what a room costs the organization to operate vs. what Family House charges—amounts to more than $1.2 million annually. These funds are provided each year through generous contributions from individuals, companies, foundations, and other organizations.\n");


        List<String> basketball = new ArrayList<String>();
        basketball.add("Family House has three locations in Pittsburgh’s Oakland and Shadyside neighborhoods. Family House Neville is located at 514 N. Neville St., Pittsburgh, PA, 15213 \n" +
                "Family House Shadyside is located at 5245 Centre Ave., Pittsburgh, PA, 15232 and \n" +
                "Family House University Place is located at 116 Thackeray Ave.,  Pittsburgh, PA, 15213.\n");
        return expandableListDetail;
    }

```
- This coded is the custom build java file for drop list of the FAQ general questions
---
![FAQ](https://sabdul.it.pointpark.edu/faq.png)
---

## Contact page
### The contact page is Pretty simple and basic for only XML code is just added!

- Neville
- Shadyside
- University Place

```xml
<TextView
        android:id="@+id/textView17"
        android:layout_width="306dp"
        android:layout_height="31dp"
        android:layout_centerHorizontal="true"
        android:text="Pittsburgh, PA 15213"
        android:textColor="#D0000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.285"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.668" />

    <TextView
        android:id="@+id/textView16"
        android:layout_width="306dp"
        android:layout_height="31dp"
        android:layout_centerHorizontal="true"
        android:text="116 Thackeray Avenue"
        android:textColor="#D0000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.285"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.624" />

    <TextView
        android:id="@+id/textView15"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="412-578-3183"
        android:textAllCaps="false"
        android:textColor="#000000"
        android:textSize="22sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.109"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.58" />

    <TextView
        android:id="@+id/textView14"
        android:layout_width="203dp"
        android:layout_height="33dp"
        android:text="University Place"
        android:textColor="#4D4D4D"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.144"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.535" />

    <View
        android:id="@+id/view2"
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="@android:color/darker_gray"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.487" />

    <TextView
        android:id="@+id/textView13"
        android:layout_width="306dp"
        android:layout_height="31dp"
        android:layout_centerHorizontal="true"
        android:text="Pittsburgh, PA 15213"
        android:textColor="#D0000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.285"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.415" />

    <TextView
        android:id="@+id/textView12"
        android:layout_width="306dp"
        android:layout_height="31dp"
        android:layout_centerHorizontal="true"
        android:text="514 North Neville Street"
        android:textColor="#D0000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.285"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.371" />

    <TextView
        android:id="@+id/textView11"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="412-578-8650"
        android:textAllCaps="false"
        android:textColor="#000000"
        android:textSize="22sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.109"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.328" />

    <TextView
        android:id="@+id/textView10"
        android:layout_width="147dp"
        android:layout_height="32dp"
        android:text="Neville"
        android:textColor="#4D4D4D"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.113"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.283" />

    <View
        android:id="@+id/view"
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="@android:color/darker_gray"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.249" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="306dp"
        android:layout_height="31dp"
        android:layout_centerHorizontal="true"
        android:text="Pittsburgh, PA 15232"
        android:textColor="#D0000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.285"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.17" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="306dp"
        android:layout_height="31dp"
        android:layout_centerHorizontal="true"
        android:text="5245 Centre Avenue"
        android:textColor="#D0000000"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.285"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.125" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="412-802-8210"
        android:textAllCaps="false"
        android:textColor="#000000"
        android:textSize="22sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.108"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.082" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="147dp"
        android:layout_height="32dp"
        android:text="Shadyside"
        android:textColor="#4D4D4D"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.113"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.037" />
```
- That's all I did for now! Most of the Front-End is done as for now
---
![Contacts](https://sabdul.it.pointpark.edu/contact.png)
---


