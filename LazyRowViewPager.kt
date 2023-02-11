/***
* This is a very basic way to implement view pager type views in Jetpack compose.
*/

@Composable
@OptIn(ExperimentalFoundationApi::class)
private fun <I> LazyRowViewPager(
    items: List<I>,
    onPositionChanged: (Int) -> Unit,
    composeItem: @Composable (I) -> Unit
) {
    val state = rememberLazyListState()


    LazyRow(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        state = state,
        flingBehavior = rememberSnapFlingBehavior(lazyListState = state),
        horizontalArrangement = Arrangement.Start,

    ) {
        items(items.size) {
            onPositionChanged(state.firstVisibleItemIndex)
            composeItem(items[it])
        }

    }
}
