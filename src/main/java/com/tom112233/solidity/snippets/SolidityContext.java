package com.tom112233.solidity.snippets;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class SolidityContext extends TemplateContextType {
    protected SolidityContext() {
        super("SOLIDITY","Solidity");
    }
    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".sol");
    }
}
