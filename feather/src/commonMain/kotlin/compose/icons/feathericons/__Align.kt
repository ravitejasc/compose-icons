package compose.icons.feathericons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.FeatherIcons
import compose.icons.feathericons.align.Center
import compose.icons.feathericons.align.Justify
import compose.icons.feathericons.align.Left
import compose.icons.feathericons.align.Right
import kotlin.collections.List as ____KtList

public object AlignGroup

public val FeatherIcons.Align: AlignGroup
  get() = AlignGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AlignGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Left, Right, Center, Justify)
    return __AllIcons!!
  }
