package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Droplet: ImageVector
    get() {
        if (_droplet != null) {
            return _droplet!!
        }
        _droplet = Builder(name = "Droplet", defaultWidth = 24.2.dp, defaultHeight = 24.2.dp,
                viewportWidth = 24.2f, viewportHeight = 24.2f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.1992f, 8.0E-4f)
                lineToRelative(23.9992f, 0.2011f)
                lineToRelative(-0.2011f, 23.9992f)
                lineToRelative(-23.9992f, -0.2011f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.1f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -5.28f, -2.28f)
                arcTo(7.73f, 7.73f, 0.0f, false, true, 6.82f, 8.05f)
                lineTo(11.46f, 3.4f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.71f, -0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.71f, 0.31f)
                lineToRelative(4.56f, 4.72f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, true, -0.09f, 10.77f)
                arcTo(7.33f, 7.33f, 0.0f, false, true, 12.0f, 21.1f)
                close()
                moveTo(12.13f, 5.53f)
                lineTo(8.24f, 9.45f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, false, -0.07f, 8.0f)
                arcTo(5.43f, 5.43f, 0.0f, false, false, 12.0f, 19.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, false, 3.9f, -1.61f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, 0.06f, -8.0f)
                close()
            }
        }
        .build()
        return _droplet!!
    }

private var _droplet: ImageVector? = null