package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.StopCircleSolid: ImageVector
    get() {
        if (_stopCircleSolid != null) {
            return _stopCircleSolid!!
        }
        _stopCircleSolid = Builder(name = "StopCircleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.85f, 3.0f, 3.0f, 8.85f, 3.0f, 16.0f)
                curveTo(3.0f, 23.15f, 8.85f, 29.0f, 16.0f, 29.0f)
                curveTo(23.15f, 29.0f, 29.0f, 23.15f, 29.0f, 16.0f)
                curveTo(29.0f, 8.85f, 23.15f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.05f, 5.0f, 27.0f, 9.95f, 27.0f, 16.0f)
                curveTo(27.0f, 22.05f, 22.05f, 27.0f, 16.0f, 27.0f)
                curveTo(9.95f, 27.0f, 5.0f, 22.05f, 5.0f, 16.0f)
                curveTo(5.0f, 9.95f, 9.95f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(11.0f, 13.5f)
                lineTo(11.0f, 18.5f)
                lineTo(11.0f, 21.0f)
                lineTo(13.5f, 21.0f)
                lineTo(18.5f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 18.5f)
                lineTo(21.0f, 13.5f)
                lineTo(21.0f, 11.0f)
                lineTo(18.5f, 11.0f)
                lineTo(13.5f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _stopCircleSolid!!
    }

private var _stopCircleSolid: ImageVector? = null