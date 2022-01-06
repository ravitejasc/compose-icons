package compose.icons.feathericons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.FeatherIcons
import compose.icons.feathericons.alert.Circle
import compose.icons.feathericons.alert.Octagon
import compose.icons.feathericons.alert.Triangle
import kotlin.collections.List as ____KtList

public object AlertGroup

public val FeatherIcons.Alert: AlertGroup
  get() = AlertGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AlertGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Octagon, Triangle, Circle)
    return __AllIcons!!
  }
