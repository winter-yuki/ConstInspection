package com.github.winteryuki.constinspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection

class ConstKotlinInspection : AbstractKotlinInspection() {
    override fun buildVisitor(
        holder: ProblemsHolder, isOnTheFly: Boolean
    ): PsiElementVisitor = object : PsiElementVisitor() {
        override fun visitFile(file: PsiFile) = super.visitFile(file).also {
            holder.registerProblem(file, "Hello! Thank you for using Kotlin! Stay with us!")
        }
    }
}
