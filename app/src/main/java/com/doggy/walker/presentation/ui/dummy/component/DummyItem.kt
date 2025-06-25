package com.doggy.walker.presentation.ui.dummy.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.doggy.walker.R.string.profile
import com.doggy.walker.core.designsystem.theme.DoggyWalkerTheme
import com.doggy.walker.core.util.noRippleClickable

@Composable
fun DummyItem(
    id: Int,
    firstName: String,
    lastName: String,
    profileUrl: String,
    navigateNext: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = profileUrl,
            contentDescription = stringResource(profile),
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .noRippleClickable {
                    navigateNext()
                },
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "$firstName $lastName",
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "ID: $id",
        )
    }
}

@Preview
@Composable
private fun DummyItemPreview() {
   DoggyWalkerTheme {
        DummyItem(
            id = 1,
            firstName = "minseong",
            lastName = "Son",
            profileUrl = "",
            navigateNext = {}
        )
    }
}
