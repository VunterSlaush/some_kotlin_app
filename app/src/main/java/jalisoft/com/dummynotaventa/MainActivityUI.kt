package jalisoft.com.dummynotaventa
import android.view.*
import android.widget.*
import org.jetbrains.anko.*



class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui){

        verticalLayout {
            weightSum = 100f
            id = Ids.parent
            orientation = LinearLayout.HORIZONTAL

            linearLayout {
                orientation = LinearLayout.VERTICAL
                padding = dip(5)
                weightSum = 100f

                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    padding = dip(5)
                    weightSum = 100f

                    linearLayout {
                        orientation = LinearLayout.VERTICAL
                        padding = dip(2)
                        weightSum = 100f

                        linearLayout {
                            orientation = LinearLayout.HORIZONTAL
                            weightSum = 100f

                            textView("Tacos") {
                                textAlignment = View.TEXT_ALIGNMENT_CENTER
                            }.lparams(width = dip(0), height = wrapContent) {
                                weight = 33F
                                margin = dip(2)
                            }
                            textView("Tortas") {
                                textAlignment = View.TEXT_ALIGNMENT_CENTER
                            }.lparams(width = dip(0), height = wrapContent) {
                                weight = 33F
                                margin = dip(2)
                            }
                            textView("Orden") {
                                textAlignment = View.TEXT_ALIGNMENT_CENTER
                            }.lparams(width = dip(0), height = wrapContent) {
                                weight = 33F
                                margin = dip(2)
                            }
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 20F
                        }
                        button("1/2").lparams(width = matchParent, height = dip(0)) {
                            weight = 40F
                        }
                        button("+").lparams(width = matchParent, height = dip(0)) {
                            weight = 40F
                        }
                    }.lparams(width = dip(0), height = matchParent) {
                        weight = 50F
                    }
                    linearLayout {
                        orientation = LinearLayout.VERTICAL
                        padding = dip(2)
                        weightSum = 100f

                        textView("Tacos") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 33F
                            margin = dip(5)
                        }
                        textView("Tortas") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 33F
                            margin = dip(5)
                        }
                        textView("Orden") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 33F
                            margin = dip(5)
                        }
                    }.lparams(width = dip(0), height = matchParent) {
                        gravity = Gravity.CENTER
                        weight = 25F
                    }
                    linearLayout {
                        orientation = LinearLayout.VERTICAL
                        padding = dip(2)
                        weightSum = 100f

                        textView("Tacos") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 33F
                            margin = dip(5)
                        }
                        textView("Tortas") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 33F
                            margin = dip(5)
                        }
                        textView("Orden") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = dip(0)) {
                            weight = 33F
                            margin = dip(5)
                        }
                    }.lparams(width = dip(0), height = matchParent) {
                        weight = 25F
                    }
                }.lparams(width = matchParent, height = dip(0)) {
                    weight = 40F
                }
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    padding = dip(5)
                    weightSum = 100f

                    linearLayout {
                        orientation = LinearLayout.VERTICAL

                        textView("Bebidas") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = wrapContent)
                        listView {
                            id = Ids.bebidasList
                        }.lparams(width = matchParent, height = matchParent)
                    }.lparams(width = dip(0), height = matchParent) {
                        weight = 50F
                    }
                    linearLayout {
                        orientation = LinearLayout.VERTICAL

                        textView("Postres") {
                            textAlignment = View.TEXT_ALIGNMENT_CENTER
                        }.lparams(width = matchParent, height = wrapContent)
                        listView {
                            id = Ids.postresList
                        }.lparams(width = matchParent, height = matchParent)
                    }.lparams(width = dip(0), height = matchParent) {
                        weight = 50F
                    }
                }.lparams(width = matchParent, height = dip(0)) {
                    weight = 30F
                }
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    padding = dip(5)

                    textView("Otros / Dulces") {
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                    }.lparams(width = matchParent, height = wrapContent)
                    listView {
                        id = Ids.dulcesList
                    }.lparams(width = matchParent, height = matchParent)
                }.lparams(width = matchParent, height = dip(0)) {
                    weight = 30F
                }
            }.lparams(width = dip(0), height = matchParent) {
                weight = 60F
            }
            linearLayout {
                orientation = LinearLayout.VERTICAL
                padding = dip(5)
                weightSum = 100f

                textView("Nota de Venta") {
                    textSize = 14f
                }.lparams(width = matchParent, height = dip(0)) {
                    weight = 10F
                }
                listView {
                    id = Ids.notaVentaList

                }.lparams(width = matchParent, height = dip(0)) {
                    weight = 70F
                }
                linearLayout().lparams(width = matchParent, height = dip(0)) {
                    weight = 20F
                }
            }.lparams(width = dip(0), height = matchParent) {
                weight = 40F
            }
        }
    }

    private object Ids {

        val bebidasList = 1
        val dulcesList = 2
        val notaVentaList = 3
        val postresList = 4
        val parent = 0
    }

}