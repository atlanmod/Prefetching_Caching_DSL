/**
 */
package org.eclipse.gmt.modisco.java.cdo.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.*;
import org.eclipse.gmt.modisco.java.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.java.cdo.meta.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static JavaPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = JavaPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JavaSwitch<Adapter> modelSwitch =
        new JavaSwitch<Adapter>() {
            @Override
            public Adapter caseAbstractMethodDeclaration(AbstractMethodDeclaration object) {
                return createAbstractMethodDeclarationAdapter();
            }
            @Override
            public Adapter caseAbstractMethodInvocation(AbstractMethodInvocation object) {
                return createAbstractMethodInvocationAdapter();
            }
            @Override
            public Adapter caseAbstractTypeDeclaration(AbstractTypeDeclaration object) {
                return createAbstractTypeDeclarationAdapter();
            }
            @Override
            public Adapter caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression object) {
                return createAbstractTypeQualifiedExpressionAdapter();
            }
            @Override
            public Adapter caseAbstractVariablesContainer(AbstractVariablesContainer object) {
                return createAbstractVariablesContainerAdapter();
            }
            @Override
            public Adapter caseAnnotation(Annotation object) {
                return createAnnotationAdapter();
            }
            @Override
            public Adapter caseArchive(Archive object) {
                return createArchiveAdapter();
            }
            @Override
            public Adapter caseAssertStatement(AssertStatement object) {
                return createAssertStatementAdapter();
            }
            @Override
            public Adapter caseASTNode(ASTNode object) {
                return createASTNodeAdapter();
            }
            @Override
            public Adapter caseAnnotationMemberValuePair(AnnotationMemberValuePair object) {
                return createAnnotationMemberValuePairAdapter();
            }
            @Override
            public Adapter caseAnnotationTypeDeclaration(AnnotationTypeDeclaration object) {
                return createAnnotationTypeDeclarationAdapter();
            }
            @Override
            public Adapter caseAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration object) {
                return createAnnotationTypeMemberDeclarationAdapter();
            }
            @Override
            public Adapter caseAnonymousClassDeclaration(AnonymousClassDeclaration object) {
                return createAnonymousClassDeclarationAdapter();
            }
            @Override
            public Adapter caseArrayAccess(ArrayAccess object) {
                return createArrayAccessAdapter();
            }
            @Override
            public Adapter caseArrayCreation(ArrayCreation object) {
                return createArrayCreationAdapter();
            }
            @Override
            public Adapter caseArrayInitializer(ArrayInitializer object) {
                return createArrayInitializerAdapter();
            }
            @Override
            public Adapter caseArrayLengthAccess(ArrayLengthAccess object) {
                return createArrayLengthAccessAdapter();
            }
            @Override
            public Adapter caseArrayType(ArrayType object) {
                return createArrayTypeAdapter();
            }
            @Override
            public Adapter caseAssignment(Assignment object) {
                return createAssignmentAdapter();
            }
            @Override
            public Adapter caseBodyDeclaration(BodyDeclaration object) {
                return createBodyDeclarationAdapter();
            }
            @Override
            public Adapter caseBooleanLiteral(BooleanLiteral object) {
                return createBooleanLiteralAdapter();
            }
            @Override
            public Adapter caseBlockComment(BlockComment object) {
                return createBlockCommentAdapter();
            }
            @Override
            public Adapter caseBlock(Block object) {
                return createBlockAdapter();
            }
            @Override
            public Adapter caseBreakStatement(BreakStatement object) {
                return createBreakStatementAdapter();
            }
            @Override
            public Adapter caseCastExpression(CastExpression object) {
                return createCastExpressionAdapter();
            }
            @Override
            public Adapter caseCatchClause(CatchClause object) {
                return createCatchClauseAdapter();
            }
            @Override
            public Adapter caseCharacterLiteral(CharacterLiteral object) {
                return createCharacterLiteralAdapter();
            }
            @Override
            public Adapter caseClassFile(ClassFile object) {
                return createClassFileAdapter();
            }
            @Override
            public Adapter caseClassInstanceCreation(ClassInstanceCreation object) {
                return createClassInstanceCreationAdapter();
            }
            @Override
            public Adapter caseConstructorDeclaration(ConstructorDeclaration object) {
                return createConstructorDeclarationAdapter();
            }
            @Override
            public Adapter caseConditionalExpression(ConditionalExpression object) {
                return createConditionalExpressionAdapter();
            }
            @Override
            public Adapter caseConstructorInvocation(ConstructorInvocation object) {
                return createConstructorInvocationAdapter();
            }
            @Override
            public Adapter caseClassDeclaration(ClassDeclaration object) {
                return createClassDeclarationAdapter();
            }
            @Override
            public Adapter caseComment(Comment object) {
                return createCommentAdapter();
            }
            @Override
            public Adapter caseCompilationUnit(CompilationUnit object) {
                return createCompilationUnitAdapter();
            }
            @Override
            public Adapter caseContinueStatement(ContinueStatement object) {
                return createContinueStatementAdapter();
            }
            @Override
            public Adapter caseDoStatement(DoStatement object) {
                return createDoStatementAdapter();
            }
            @Override
            public Adapter caseEmptyStatement(EmptyStatement object) {
                return createEmptyStatementAdapter();
            }
            @Override
            public Adapter caseEnhancedForStatement(EnhancedForStatement object) {
                return createEnhancedForStatementAdapter();
            }
            @Override
            public Adapter caseEnumConstantDeclaration(EnumConstantDeclaration object) {
                return createEnumConstantDeclarationAdapter();
            }
            @Override
            public Adapter caseEnumDeclaration(EnumDeclaration object) {
                return createEnumDeclarationAdapter();
            }
            @Override
            public Adapter caseExpression(Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public Adapter caseExpressionStatement(ExpressionStatement object) {
                return createExpressionStatementAdapter();
            }
            @Override
            public Adapter caseFieldAccess(FieldAccess object) {
                return createFieldAccessAdapter();
            }
            @Override
            public Adapter caseFieldDeclaration(FieldDeclaration object) {
                return createFieldDeclarationAdapter();
            }
            @Override
            public Adapter caseForStatement(ForStatement object) {
                return createForStatementAdapter();
            }
            @Override
            public Adapter caseIfStatement(IfStatement object) {
                return createIfStatementAdapter();
            }
            @Override
            public Adapter caseImportDeclaration(ImportDeclaration object) {
                return createImportDeclarationAdapter();
            }
            @Override
            public Adapter caseInfixExpression(InfixExpression object) {
                return createInfixExpressionAdapter();
            }
            @Override
            public Adapter caseInitializer(Initializer object) {
                return createInitializerAdapter();
            }
            @Override
            public Adapter caseInstanceofExpression(InstanceofExpression object) {
                return createInstanceofExpressionAdapter();
            }
            @Override
            public Adapter caseInterfaceDeclaration(InterfaceDeclaration object) {
                return createInterfaceDeclarationAdapter();
            }
            @Override
            public Adapter caseJavadoc(Javadoc object) {
                return createJavadocAdapter();
            }
            @Override
            public Adapter caseLabeledStatement(LabeledStatement object) {
                return createLabeledStatementAdapter();
            }
            @Override
            public Adapter caseLineComment(LineComment object) {
                return createLineCommentAdapter();
            }
            @Override
            public Adapter caseManifest(Manifest object) {
                return createManifestAdapter();
            }
            @Override
            public Adapter caseManifestAttribute(ManifestAttribute object) {
                return createManifestAttributeAdapter();
            }
            @Override
            public Adapter caseManifestEntry(ManifestEntry object) {
                return createManifestEntryAdapter();
            }
            @Override
            public Adapter caseMemberRef(MemberRef object) {
                return createMemberRefAdapter();
            }
            @Override
            public Adapter caseMethodDeclaration(MethodDeclaration object) {
                return createMethodDeclarationAdapter();
            }
            @Override
            public Adapter caseMethodInvocation(MethodInvocation object) {
                return createMethodInvocationAdapter();
            }
            @Override
            public Adapter caseMethodRef(MethodRef object) {
                return createMethodRefAdapter();
            }
            @Override
            public Adapter caseMethodRefParameter(MethodRefParameter object) {
                return createMethodRefParameterAdapter();
            }
            @Override
            public Adapter caseModel(Model object) {
                return createModelAdapter();
            }
            @Override
            public Adapter caseModifier(Modifier object) {
                return createModifierAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseNamespaceAccess(NamespaceAccess object) {
                return createNamespaceAccessAdapter();
            }
            @Override
            public Adapter caseNumberLiteral(NumberLiteral object) {
                return createNumberLiteralAdapter();
            }
            @Override
            public Adapter caseNullLiteral(NullLiteral object) {
                return createNullLiteralAdapter();
            }
            @Override
            public Adapter casePackage(org.eclipse.gmt.modisco.java.Package object) {
                return createPackageAdapter();
            }
            @Override
            public Adapter casePackageAccess(PackageAccess object) {
                return createPackageAccessAdapter();
            }
            @Override
            public Adapter caseParameterizedType(ParameterizedType object) {
                return createParameterizedTypeAdapter();
            }
            @Override
            public Adapter caseParenthesizedExpression(ParenthesizedExpression object) {
                return createParenthesizedExpressionAdapter();
            }
            @Override
            public Adapter casePostfixExpression(PostfixExpression object) {
                return createPostfixExpressionAdapter();
            }
            @Override
            public Adapter casePrefixExpression(PrefixExpression object) {
                return createPrefixExpressionAdapter();
            }
            @Override
            public Adapter casePrimitiveType(PrimitiveType object) {
                return createPrimitiveTypeAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
                return createPrimitiveTypeBooleanAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeByte(PrimitiveTypeByte object) {
                return createPrimitiveTypeByteAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeChar(PrimitiveTypeChar object) {
                return createPrimitiveTypeCharAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
                return createPrimitiveTypeDoubleAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeShort(PrimitiveTypeShort object) {
                return createPrimitiveTypeShortAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
                return createPrimitiveTypeFloatAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeInt(PrimitiveTypeInt object) {
                return createPrimitiveTypeIntAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeLong(PrimitiveTypeLong object) {
                return createPrimitiveTypeLongAdapter();
            }
            @Override
            public Adapter casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
                return createPrimitiveTypeVoidAdapter();
            }
            @Override
            public Adapter caseReturnStatement(ReturnStatement object) {
                return createReturnStatementAdapter();
            }
            @Override
            public Adapter caseSingleVariableAccess(SingleVariableAccess object) {
                return createSingleVariableAccessAdapter();
            }
            @Override
            public Adapter caseSingleVariableDeclaration(SingleVariableDeclaration object) {
                return createSingleVariableDeclarationAdapter();
            }
            @Override
            public Adapter caseStatement(Statement object) {
                return createStatementAdapter();
            }
            @Override
            public Adapter caseStringLiteral(StringLiteral object) {
                return createStringLiteralAdapter();
            }
            @Override
            public Adapter caseSuperConstructorInvocation(SuperConstructorInvocation object) {
                return createSuperConstructorInvocationAdapter();
            }
            @Override
            public Adapter caseSuperFieldAccess(SuperFieldAccess object) {
                return createSuperFieldAccessAdapter();
            }
            @Override
            public Adapter caseSuperMethodInvocation(SuperMethodInvocation object) {
                return createSuperMethodInvocationAdapter();
            }
            @Override
            public Adapter caseSwitchCase(SwitchCase object) {
                return createSwitchCaseAdapter();
            }
            @Override
            public Adapter caseSwitchStatement(SwitchStatement object) {
                return createSwitchStatementAdapter();
            }
            @Override
            public Adapter caseSynchronizedStatement(SynchronizedStatement object) {
                return createSynchronizedStatementAdapter();
            }
            @Override
            public Adapter caseTagElement(TagElement object) {
                return createTagElementAdapter();
            }
            @Override
            public Adapter caseTextElement(TextElement object) {
                return createTextElementAdapter();
            }
            @Override
            public Adapter caseThisExpression(ThisExpression object) {
                return createThisExpressionAdapter();
            }
            @Override
            public Adapter caseThrowStatement(ThrowStatement object) {
                return createThrowStatementAdapter();
            }
            @Override
            public Adapter caseTryStatement(TryStatement object) {
                return createTryStatementAdapter();
            }
            @Override
            public Adapter caseType(Type object) {
                return createTypeAdapter();
            }
            @Override
            public Adapter caseTypeAccess(TypeAccess object) {
                return createTypeAccessAdapter();
            }
            @Override
            public Adapter caseTypeDeclaration(TypeDeclaration object) {
                return createTypeDeclarationAdapter();
            }
            @Override
            public Adapter caseTypeDeclarationStatement(TypeDeclarationStatement object) {
                return createTypeDeclarationStatementAdapter();
            }
            @Override
            public Adapter caseTypeLiteral(TypeLiteral object) {
                return createTypeLiteralAdapter();
            }
            @Override
            public Adapter caseTypeParameter(TypeParameter object) {
                return createTypeParameterAdapter();
            }
            @Override
            public Adapter caseUnresolvedItem(UnresolvedItem object) {
                return createUnresolvedItemAdapter();
            }
            @Override
            public Adapter caseUnresolvedItemAccess(UnresolvedItemAccess object) {
                return createUnresolvedItemAccessAdapter();
            }
            @Override
            public Adapter caseUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration object) {
                return createUnresolvedAnnotationDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration object) {
                return createUnresolvedAnnotationTypeMemberDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedClassDeclaration(UnresolvedClassDeclaration object) {
                return createUnresolvedClassDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedEnumDeclaration(UnresolvedEnumDeclaration object) {
                return createUnresolvedEnumDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration object) {
                return createUnresolvedInterfaceDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedLabeledStatement(UnresolvedLabeledStatement object) {
                return createUnresolvedLabeledStatementAdapter();
            }
            @Override
            public Adapter caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration object) {
                return createUnresolvedMethodDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration object) {
                return createUnresolvedSingleVariableDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedType(UnresolvedType object) {
                return createUnresolvedTypeAdapter();
            }
            @Override
            public Adapter caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
                return createUnresolvedTypeDeclarationAdapter();
            }
            @Override
            public Adapter caseUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment object) {
                return createUnresolvedVariableDeclarationFragmentAdapter();
            }
            @Override
            public Adapter caseVariableDeclaration(VariableDeclaration object) {
                return createVariableDeclarationAdapter();
            }
            @Override
            public Adapter caseVariableDeclarationExpression(VariableDeclarationExpression object) {
                return createVariableDeclarationExpressionAdapter();
            }
            @Override
            public Adapter caseVariableDeclarationFragment(VariableDeclarationFragment object) {
                return createVariableDeclarationFragmentAdapter();
            }
            @Override
            public Adapter caseVariableDeclarationStatement(VariableDeclarationStatement object) {
                return createVariableDeclarationStatementAdapter();
            }
            @Override
            public Adapter caseWildCardType(WildCardType object) {
                return createWildCardTypeAdapter();
            }
            @Override
            public Adapter caseWhileStatement(WhileStatement object) {
                return createWhileStatementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AbstractMethodDeclaration <em>Abstract Method Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AbstractMethodDeclaration
     * @generated
     */
    public Adapter createAbstractMethodDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AbstractMethodInvocation <em>Abstract Method Invocation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AbstractMethodInvocation
     * @generated
     */
    public Adapter createAbstractMethodInvocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AbstractTypeDeclaration
     * @generated
     */
    public Adapter createAbstractTypeDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AbstractTypeQualifiedExpression <em>Abstract Type Qualified Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AbstractTypeQualifiedExpression
     * @generated
     */
    public Adapter createAbstractTypeQualifiedExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AbstractVariablesContainer <em>Abstract Variables Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AbstractVariablesContainer
     * @generated
     */
    public Adapter createAbstractVariablesContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Annotation
     * @generated
     */
    public Adapter createAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Archive <em>Archive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Archive
     * @generated
     */
    public Adapter createArchiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AssertStatement <em>Assert Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AssertStatement
     * @generated
     */
    public Adapter createAssertStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ASTNode <em>AST Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ASTNode
     * @generated
     */
    public Adapter createASTNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AnnotationMemberValuePair <em>Annotation Member Value Pair</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AnnotationMemberValuePair
     * @generated
     */
    public Adapter createAnnotationMemberValuePairAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AnnotationTypeDeclaration <em>Annotation Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AnnotationTypeDeclaration
     * @generated
     */
    public Adapter createAnnotationTypeDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AnnotationTypeMemberDeclaration <em>Annotation Type Member Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AnnotationTypeMemberDeclaration
     * @generated
     */
    public Adapter createAnnotationTypeMemberDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.AnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.AnonymousClassDeclaration
     * @generated
     */
    public Adapter createAnonymousClassDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ArrayAccess <em>Array Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ArrayAccess
     * @generated
     */
    public Adapter createArrayAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ArrayCreation <em>Array Creation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ArrayCreation
     * @generated
     */
    public Adapter createArrayCreationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ArrayInitializer <em>Array Initializer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ArrayInitializer
     * @generated
     */
    public Adapter createArrayInitializerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ArrayLengthAccess <em>Array Length Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ArrayLengthAccess
     * @generated
     */
    public Adapter createArrayLengthAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ArrayType <em>Array Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ArrayType
     * @generated
     */
    public Adapter createArrayTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.BodyDeclaration <em>Body Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.BodyDeclaration
     * @generated
     */
    public Adapter createBodyDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.BooleanLiteral <em>Boolean Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.BooleanLiteral
     * @generated
     */
    public Adapter createBooleanLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.BlockComment <em>Block Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.BlockComment
     * @generated
     */
    public Adapter createBlockCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Block <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Block
     * @generated
     */
    public Adapter createBlockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.BreakStatement <em>Break Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.BreakStatement
     * @generated
     */
    public Adapter createBreakStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.CastExpression <em>Cast Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.CastExpression
     * @generated
     */
    public Adapter createCastExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.CatchClause <em>Catch Clause</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.CatchClause
     * @generated
     */
    public Adapter createCatchClauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.CharacterLiteral <em>Character Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.CharacterLiteral
     * @generated
     */
    public Adapter createCharacterLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ClassFile <em>Class File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ClassFile
     * @generated
     */
    public Adapter createClassFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ClassInstanceCreation <em>Class Instance Creation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ClassInstanceCreation
     * @generated
     */
    public Adapter createClassInstanceCreationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ConstructorDeclaration <em>Constructor Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ConstructorDeclaration
     * @generated
     */
    public Adapter createConstructorDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ConditionalExpression <em>Conditional Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ConditionalExpression
     * @generated
     */
    public Adapter createConditionalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ConstructorInvocation <em>Constructor Invocation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ConstructorInvocation
     * @generated
     */
    public Adapter createConstructorInvocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ClassDeclaration <em>Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ClassDeclaration
     * @generated
     */
    public Adapter createClassDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.CompilationUnit <em>Compilation Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.CompilationUnit
     * @generated
     */
    public Adapter createCompilationUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ContinueStatement <em>Continue Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ContinueStatement
     * @generated
     */
    public Adapter createContinueStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.DoStatement <em>Do Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.DoStatement
     * @generated
     */
    public Adapter createDoStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.EmptyStatement <em>Empty Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.EmptyStatement
     * @generated
     */
    public Adapter createEmptyStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.EnhancedForStatement <em>Enhanced For Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.EnhancedForStatement
     * @generated
     */
    public Adapter createEnhancedForStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.EnumConstantDeclaration
     * @generated
     */
    public Adapter createEnumConstantDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.EnumDeclaration <em>Enum Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.EnumDeclaration
     * @generated
     */
    public Adapter createEnumDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ExpressionStatement <em>Expression Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ExpressionStatement
     * @generated
     */
    public Adapter createExpressionStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.FieldAccess <em>Field Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.FieldAccess
     * @generated
     */
    public Adapter createFieldAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.FieldDeclaration <em>Field Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.FieldDeclaration
     * @generated
     */
    public Adapter createFieldDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ForStatement <em>For Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ForStatement
     * @generated
     */
    public Adapter createForStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.IfStatement <em>If Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.IfStatement
     * @generated
     */
    public Adapter createIfStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ImportDeclaration <em>Import Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ImportDeclaration
     * @generated
     */
    public Adapter createImportDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.InfixExpression <em>Infix Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.InfixExpression
     * @generated
     */
    public Adapter createInfixExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Initializer <em>Initializer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Initializer
     * @generated
     */
    public Adapter createInitializerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.InstanceofExpression <em>Instanceof Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.InstanceofExpression
     * @generated
     */
    public Adapter createInstanceofExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.InterfaceDeclaration <em>Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.InterfaceDeclaration
     * @generated
     */
    public Adapter createInterfaceDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Javadoc <em>Javadoc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Javadoc
     * @generated
     */
    public Adapter createJavadocAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.LabeledStatement <em>Labeled Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.LabeledStatement
     * @generated
     */
    public Adapter createLabeledStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.LineComment <em>Line Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.LineComment
     * @generated
     */
    public Adapter createLineCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Manifest <em>Manifest</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Manifest
     * @generated
     */
    public Adapter createManifestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ManifestAttribute <em>Manifest Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ManifestAttribute
     * @generated
     */
    public Adapter createManifestAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ManifestEntry <em>Manifest Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ManifestEntry
     * @generated
     */
    public Adapter createManifestEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.MemberRef <em>Member Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.MemberRef
     * @generated
     */
    public Adapter createMemberRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.MethodDeclaration <em>Method Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.MethodDeclaration
     * @generated
     */
    public Adapter createMethodDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.MethodInvocation <em>Method Invocation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.MethodInvocation
     * @generated
     */
    public Adapter createMethodInvocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.MethodRef <em>Method Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.MethodRef
     * @generated
     */
    public Adapter createMethodRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.MethodRefParameter <em>Method Ref Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.MethodRefParameter
     * @generated
     */
    public Adapter createMethodRefParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Modifier <em>Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Modifier
     * @generated
     */
    public Adapter createModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.NamespaceAccess <em>Namespace Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.NamespaceAccess
     * @generated
     */
    public Adapter createNamespaceAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.NumberLiteral <em>Number Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.NumberLiteral
     * @generated
     */
    public Adapter createNumberLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.NullLiteral <em>Null Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.NullLiteral
     * @generated
     */
    public Adapter createNullLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PackageAccess <em>Package Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PackageAccess
     * @generated
     */
    public Adapter createPackageAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ParameterizedType <em>Parameterized Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ParameterizedType
     * @generated
     */
    public Adapter createParameterizedTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ParenthesizedExpression
     * @generated
     */
    public Adapter createParenthesizedExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PostfixExpression <em>Postfix Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PostfixExpression
     * @generated
     */
    public Adapter createPostfixExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrefixExpression <em>Prefix Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrefixExpression
     * @generated
     */
    public Adapter createPrefixExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveType
     * @generated
     */
    public Adapter createPrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeBoolean <em>Primitive Type Boolean</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeBoolean
     * @generated
     */
    public Adapter createPrimitiveTypeBooleanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeByte <em>Primitive Type Byte</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeByte
     * @generated
     */
    public Adapter createPrimitiveTypeByteAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeChar <em>Primitive Type Char</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeChar
     * @generated
     */
    public Adapter createPrimitiveTypeCharAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeDouble <em>Primitive Type Double</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeDouble
     * @generated
     */
    public Adapter createPrimitiveTypeDoubleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeShort <em>Primitive Type Short</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeShort
     * @generated
     */
    public Adapter createPrimitiveTypeShortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeFloat <em>Primitive Type Float</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeFloat
     * @generated
     */
    public Adapter createPrimitiveTypeFloatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeInt <em>Primitive Type Int</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeInt
     * @generated
     */
    public Adapter createPrimitiveTypeIntAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeLong <em>Primitive Type Long</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeLong
     * @generated
     */
    public Adapter createPrimitiveTypeLongAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.PrimitiveTypeVoid <em>Primitive Type Void</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.PrimitiveTypeVoid
     * @generated
     */
    public Adapter createPrimitiveTypeVoidAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ReturnStatement <em>Return Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ReturnStatement
     * @generated
     */
    public Adapter createReturnStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SingleVariableAccess <em>Single Variable Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SingleVariableAccess
     * @generated
     */
    public Adapter createSingleVariableAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SingleVariableDeclaration <em>Single Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SingleVariableDeclaration
     * @generated
     */
    public Adapter createSingleVariableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Statement
     * @generated
     */
    public Adapter createStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.StringLiteral <em>String Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.StringLiteral
     * @generated
     */
    public Adapter createStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SuperConstructorInvocation <em>Super Constructor Invocation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SuperConstructorInvocation
     * @generated
     */
    public Adapter createSuperConstructorInvocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SuperFieldAccess <em>Super Field Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SuperFieldAccess
     * @generated
     */
    public Adapter createSuperFieldAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SuperMethodInvocation <em>Super Method Invocation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SuperMethodInvocation
     * @generated
     */
    public Adapter createSuperMethodInvocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SwitchCase <em>Switch Case</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SwitchCase
     * @generated
     */
    public Adapter createSwitchCaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SwitchStatement <em>Switch Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SwitchStatement
     * @generated
     */
    public Adapter createSwitchStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.SynchronizedStatement <em>Synchronized Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.SynchronizedStatement
     * @generated
     */
    public Adapter createSynchronizedStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TagElement <em>Tag Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TagElement
     * @generated
     */
    public Adapter createTagElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TextElement <em>Text Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TextElement
     * @generated
     */
    public Adapter createTextElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ThisExpression <em>This Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ThisExpression
     * @generated
     */
    public Adapter createThisExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.ThrowStatement <em>Throw Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.ThrowStatement
     * @generated
     */
    public Adapter createThrowStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TryStatement <em>Try Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TryStatement
     * @generated
     */
    public Adapter createTryStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.Type
     * @generated
     */
    public Adapter createTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TypeAccess <em>Type Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TypeAccess
     * @generated
     */
    public Adapter createTypeAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TypeDeclaration <em>Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TypeDeclaration
     * @generated
     */
    public Adapter createTypeDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TypeDeclarationStatement <em>Type Declaration Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TypeDeclarationStatement
     * @generated
     */
    public Adapter createTypeDeclarationStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TypeLiteral <em>Type Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TypeLiteral
     * @generated
     */
    public Adapter createTypeLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.TypeParameter <em>Type Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.TypeParameter
     * @generated
     */
    public Adapter createTypeParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedItem <em>Unresolved Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedItem
     * @generated
     */
    public Adapter createUnresolvedItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedItemAccess <em>Unresolved Item Access</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedItemAccess
     * @generated
     */
    public Adapter createUnresolvedItemAccessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedAnnotationDeclaration <em>Unresolved Annotation Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedAnnotationDeclaration
     * @generated
     */
    public Adapter createUnresolvedAnnotationDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedAnnotationTypeMemberDeclaration <em>Unresolved Annotation Type Member Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedAnnotationTypeMemberDeclaration
     * @generated
     */
    public Adapter createUnresolvedAnnotationTypeMemberDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedClassDeclaration <em>Unresolved Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedClassDeclaration
     * @generated
     */
    public Adapter createUnresolvedClassDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedEnumDeclaration <em>Unresolved Enum Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedEnumDeclaration
     * @generated
     */
    public Adapter createUnresolvedEnumDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedInterfaceDeclaration <em>Unresolved Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedInterfaceDeclaration
     * @generated
     */
    public Adapter createUnresolvedInterfaceDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedLabeledStatement <em>Unresolved Labeled Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedLabeledStatement
     * @generated
     */
    public Adapter createUnresolvedLabeledStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedMethodDeclaration <em>Unresolved Method Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedMethodDeclaration
     * @generated
     */
    public Adapter createUnresolvedMethodDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedSingleVariableDeclaration <em>Unresolved Single Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedSingleVariableDeclaration
     * @generated
     */
    public Adapter createUnresolvedSingleVariableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedType <em>Unresolved Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedType
     * @generated
     */
    public Adapter createUnresolvedTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedTypeDeclaration <em>Unresolved Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedTypeDeclaration
     * @generated
     */
    public Adapter createUnresolvedTypeDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.UnresolvedVariableDeclarationFragment <em>Unresolved Variable Declaration Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.UnresolvedVariableDeclarationFragment
     * @generated
     */
    public Adapter createUnresolvedVariableDeclarationFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.VariableDeclaration <em>Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.VariableDeclaration
     * @generated
     */
    public Adapter createVariableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.VariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.VariableDeclarationExpression
     * @generated
     */
    public Adapter createVariableDeclarationExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.VariableDeclarationFragment <em>Variable Declaration Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.VariableDeclarationFragment
     * @generated
     */
    public Adapter createVariableDeclarationFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.VariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.VariableDeclarationStatement
     * @generated
     */
    public Adapter createVariableDeclarationStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.WildCardType <em>Wild Card Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.WildCardType
     * @generated
     */
    public Adapter createWildCardTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.modisco.gmt.java.WhileStatement <em>While Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.modisco.gmt.java.WhileStatement
     * @generated
     */
    public Adapter createWhileStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //JavaAdapterFactory
