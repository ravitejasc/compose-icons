package compose.icons.feathericons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.FeatherIcons
import compose.icons.feathericons.arrow.DownCircle
import compose.icons.feathericons.arrow.DownLeft
import kotlin.collections.List as ____KtList

public object ArrowGroup

public val FeatherIcons.Arrow: ArrowGroup
  get() = ArrowGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ArrowGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(DownCircle, DownLeft)
    return __AllIcons!!
  }
