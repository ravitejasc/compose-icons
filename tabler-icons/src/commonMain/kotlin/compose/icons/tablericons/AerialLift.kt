package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.AerialLift: ImageVector
    get() {
        if (_aerialLift != null) {
            return _aerialLift!!
        }
        _aerialLift = Builder(name = "AerialLift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                lineToRelative(16.0f, -2.0f)
                moveToRelative(-8.0f, 1.0f)
                verticalLineToRelative(10.0f)
                moveToRelative(-5.106f, -6.0f)
                horizontalLineToRelative(10.306f)
                curveToRelative(2.45f, 3.0f, 2.45f, 9.0f, -0.2f, 12.0f)
                horizontalLineToRelative(-10.106f)
                curveToRelative(-2.544f, -3.0f, -2.544f, -9.0f, 0.0f, -12.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(14.0f)
            }
        }
        .build()
        return _aerialLift!!
    }

private var _aerialLift: ImageVector? = null