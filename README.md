# ComposeViewPager
A Basic view pager made by LazyRow in Jetpack compose. For those who just need a solution.

[ViewPagerDemo.webm](https://user-images.githubusercontent.com/10572239/218255011-c47fdb24-a6af-4179-bdd2-deebf5a4ccd3.webm)



## Usage

```
@Composable
fun PlayGroundScreen() {
    var position by remember { mutableStateOf<Int>(1) }
    
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        
        Text(text = "Indicator $position")
        
        LazyRowViewPager (items = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8), *onPositionChanged =* {
            position = it
        }) {
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .widthIn(min = 400.dp, max = 500.dp)
                    .padding(8.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
            
                Text(it.toString(), fontSize = 32.sp)
                
            }
        }

    }

}
```

*Note:* I have descretely tried to get the snap behaviour of LazyRow/Column. If number of items are huge then consider adding key-lamda in the solution to improve performance.
