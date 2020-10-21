<h1>Cocktail Sort Example</h1>

<ul>
  <li>Cocktail Sort is a variation of Bubble sort. The Bubble sort algorithm always traverses elements from left and moves the largest element to its correct position in first iteration and second largest in second iteration and so on. Cocktail Sort traverses through a given array in both directions alternatively.</li>
  <li>Each iteration of the algorithm is broken up into 2 stages:
      <ul>
        <li>The first stage loops through the array from left to right, just like the Bubble Sort. During the loop, adjacent items are compared and if value on the left is greater than the value on the right, then values are swapped. At the end of first iteration, largest number will reside at the end of the array.</li>
        <li>The second stage loops through the array in opposite direction- starting from the item just before the most recently sorted item, and moving back to the start of the array. Here also, adjacent items are compared and are swapped if required.</li>
      </ul>
  </li>
  <li>This java example shows how to sort an element of Java ArrayList using Cocktail Sort method of Collections class.</li>
</ul>

<h3>The objective of Program</h3>
<ul>
  <li>The program firstly assign some values including person's atttributes to its object and performs sort process in terms of each attribute title. All sort process is implemented by Turkish alphabetical order.</li>
</ul>


<h3>Files contaning in this repository</h3>
<ul>
  <li>src
    <ul>
      <li>mergesort
        <ul>
          <li>CocktailSortProcess.java</li>
        </ul>
      </li>
      <li>main
        <ul>
          <li>Main.java</li>
        </ul>
      </li>
      <li>model
        <ul>
          <li>Person.java</li>
        </ul>
      </li>
      <li>util
        <ul>
          <li>DefineValues.java</li>
          <li>ShowProcess.java</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

<h3>Explaining an inforamtion of each file</h3>

<table>
  <tr>
    <th>Files Names</th>
    <th>Information</th>
  </tr>
  <tr>
    <td>CocktailProcess.java</td>
    <td>Implementing Cocktail Sort Process by Turkish alphabetical order</td>
  </tr>
  <tr>
    <td>Person.java</td>
    <td>Defining it as a POJO</td>
  </tr>
  <tr>
    <td>Main.java</td>
    <td>Handle with all project files to run the program</td>
  </tr>
  <tr>
    <td>ShowProcess.java</td>
    <td>Showing all information about Person Object as output </td>
  </tr>
  <tr>
    <td>DefineValues.java</td>
    <td>Filling its attributes into Person Object</td>
  </tr>
</table>

