package com.hyperrecursion.glancelocalsizedemo

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.LocalSize
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.SizeMode
import androidx.glance.appwidget.action.actionStartActivity
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.text.Text

class MyAppWidget : GlanceAppWidget() {

    override val sizeMode = SizeMode.Exact

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        // Load data needed to render the AppWidget.
        // Use `withContext` to switch to another thread for long running
        // operations.

        provideContent {
            // create your AppWidget here
            GlanceTheme {
                MyContent()
            }
        }
    }

    @Composable
    private fun MyContent() {
        Box(
            modifier = GlanceModifier
                .background(GlanceTheme.colors.background)
                .fillMaxSize(),
            contentAlignment = Alignment.TopStart
        ) {
            Box(
                modifier = GlanceModifier
                    .background(GlanceTheme.colors.primary)
                    .width(LocalSize.current.width)
                    .height(LocalSize.current.height),
                contentAlignment = Alignment.TopStart
            ) {
                Box(
                    modifier = GlanceModifier
                        .background(GlanceTheme.colors.secondary)
                        .width(LocalSize.current.width / 2)
                        .height(LocalSize.current.height / 2),
                    contentAlignment = Alignment.TopStart
                ) {}
            }
        }
    }
}