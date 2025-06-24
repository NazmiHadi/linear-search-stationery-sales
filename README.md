# Linear Search Stationery Sales

Java console application to manage and search sales records of stationery items using linear search.

## Features
- Input and display multiple stationary items and their monthly sales
- Search by item name or sales amount using linear search
- Display index location if found
- Clear user feedback if search fails

## Technologies Used
- Java
- Console I/O
- Arrays, Loops, Conditional Logic



#Pseudocode

Start
  Read number of students (N)
  
  Set stationaryType[N]
  Set totalSale[N]
  Set i =0
  
  while (i < N)
    Read stationaryType[i], totalSale[i]
    i=i+1
  end while

  Set i =0
  
  while (i<N)
    Print bil, stationaryType[i}, totalSale[i] , i (index location)
    i=i+1
  end while
  
  Read searchStationary
  Set searchConfirm = 0
  Set i = 0
  
  while (i < N)
    if (searchStationary = stationaryType[i])
      Display “FOUND!”, totalSale[i] , i (index location)
      searchConfirm = 1
    end if
    i=i+1
  end while
  
  if (searchConfirm = 0)
    Display “THE ELEMENT YOU SEARCH IS NOT FOUND IN THE ARRAY”
  end if

  Read searchSale
  searchConfirm = 0
  Set i = 0
  
  while ( i < N )
    if ( searchSale = totalSale[ i ])
      Display stationaryType[i], i (index location)
      searchConfirm =1
    end if
    i = i +1
  end while
  
  if (searchConfirm = 0)
    display “THE ELEMENT YOU SEARCH IS NOT FOUND IN THE ARRAY”
  end if
Stop
