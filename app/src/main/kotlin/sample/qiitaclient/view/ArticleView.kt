package sample.qiitaclient.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import sample.qiitaclient.R
import sample.qiitaclient.bindView
import sample.qiitaclient.model.Article

class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defaultStyleAttr: Int) : super(context, attrs, defaultStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defaultStyleAttr: Int,
                defaultStyleRes: Int) : super(context, attrs, defaultStyleAttr, defaultStyleRes)

    val profileImageView: ImageView by bindView(R.id.profile_image_view)
    val titleTextView: TextView? by bindView(R.id.title_text_view)
    val userNameTextView: TextView? by bindView(R.id.user_name_text_view)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_arthicle, this)
    }

    fun setArthicle(article: Article) {
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }
}