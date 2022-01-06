package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.feathericons.Activity
import compose.icons.feathericons.Airplay
import compose.icons.feathericons.Alert
import compose.icons.feathericons.Align
import compose.icons.feathericons.AllIcons
import compose.icons.feathericons.Anchor
import compose.icons.feathericons.Aperture
import compose.icons.feathericons.Archive
import compose.icons.feathericons.Arrow
import kotlin.collections.List as ____KtList

public object FeatherIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val FeatherIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrow.AllIcons + Alert.AllIcons + Align.AllIcons + listOf(Airplay, Aperture,
        Archive, Anchor, Activity)
    return __AllIcons!!
  }
