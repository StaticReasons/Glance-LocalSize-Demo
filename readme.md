Glance LocalSize Demo
---

This app is a demo to show Glance's bug in providing LocalSize.
[Google IssueTracker #335937242](https://issuetracker.google.com/335937242)

It'll provide a widget like this:
![img1.jpg](img1.jpg)

This widget contains 3 boxes which could visualize the LocalSize system provided.

Bottom is colored GlanceTheme.colors.background, size is GlanceModifier.fillMaxSize
Middle is colored GlanceTheme.colors.primary, size is LocalSize.current.width & height
Top is colored GlanceTheme.colors.secondary, size is LocalSize.current.width / 2 & height / 2

This screenshot taken from HONOR TNA_AN00 (Android 12) has well demonstrated how system provide a overestimated width and a underestimated height.